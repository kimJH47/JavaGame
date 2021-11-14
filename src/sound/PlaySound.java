package sound;

import javax.sound.sampled.*;
import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.concurrent.CountDownLatch;

public class PlaySound {
    public static void playSound(URL url,CountDownLatch sl){
        CountDownLatch syncLatch = sl;

        try (AudioInputStream stream = AudioSystem.getAudioInputStream(new File(url.getPath()))) {
            Clip clip = AudioSystem.getClip();

            // Listener which allow method return once sound is completed
            clip.addLineListener(e -> {
                if (e.getType() == LineEvent.Type.STOP) {
                    syncLatch.countDown();
                }
            });

            clip.open(stream);
            clip.start();
        } catch (Exception e) {
        }
    }
}
