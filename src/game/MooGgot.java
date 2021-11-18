package game;

import sound.PlaySound;

import java.net.URL;
import java.util.concurrent.CountDownLatch;

public class MooGgot {
    public void active() {
        URL url = getClass().getResource("../sound/source/mooggot.wav");
        CountDownLatch syncLatch = new CountDownLatch(1);
        PlaySound.playSound(url,syncLatch);
        try{ syncLatch.await(); }catch(InterruptedException e){}
        System.out.println("재생 완료");
    }
}
