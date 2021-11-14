package game;

import static java.lang.System.exit;
import static org.lwjgl.glfw.GLFW.*;
import static org.lwjgl.opengl.GL11.*;

import entity.Entity;
import org.lwjgl.Sys;
import org.lwjgl.opengl.GL;

import assets.Assets;
import gui.Gui;
import io.Timer;
import io.Window;
import render.Camera;
import render.Shader;
import sound.PlaySound;
import world.TileRenderer;
import world.World;

import java.net.URL;


public class Main {

    static public int playerNumber;

    public Main(int pn) {
        playerNumber = pn;
        Window.setCallbacks();

        if (!glfwInit()) {
            System.err.println("GLFW Failed to initialize!");
            exit(1);
        }

        Window window = new Window();
        window.setSize(640, 480);
        window.setFullscreen(false);
        window.createWindow("Game");

        GL.createCapabilities();

        glEnable(GL_BLEND);
        glBlendFunc(GL_SRC_ALPHA, GL_ONE_MINUS_SRC_ALPHA);

        Camera camera = new Camera(window.getWidth(), window.getHeight());
        glEnable(GL_TEXTURE_2D);

        TileRenderer tiles = new TileRenderer();
        Assets.initAsset();

        double frame_cap = 1.0 / 60.0;

        double frame_time = 0;
        int frames = 0;

        double time = Timer.getTime();
        double unprocessed = 0;

        Shader shader = new Shader("shader");

        String[] worlds = {"test_level","moo_level","dalgona_level"};
        World world =  new World(worlds[0], camera);
        //Wolrd 생성 후 실행중에 World 바꾸지 않을 시 에러
        world.calculateView(window);
        //calculateView 적용해야 타일 보임
        Gui gui = null;
        gui = new Gui(window);

        while (!window.shouldClose()) {
            boolean can_render = false;

            double time_2 = Timer.getTime();
            double passed = time_2 - time;
            unprocessed += passed;
            frame_time += passed;

            time = time_2;
            while (unprocessed >= frame_cap) {
                if (window.hasResized()) {
                    camera.setProjection(window.getWidth(), window.getHeight());
                    gui.resizeCamera(window);
                    world.calculateView(window);
                    glViewport(0, 0, window.getWidth(), window.getHeight());
                }

                unprocessed -= frame_cap;
                can_render = true;

                if (window.getInput().isKeyReleased(GLFW_KEY_ESCAPE)) {
                    //glfwSetWindowShouldClose(window.getWindow(), true);
                    Thread thread = new Thread(()->{
                    MooGgot mg = new MooGgot();
                    mg.active();
                    });thread.start();
                }

                gui.update(window.getInput());

                world.update((float) frame_cap, window, camera);

                world.correctCamera(camera, window);

                window.update();

                if (frame_time >= 1.0) {
                    frame_time = 0;
                    System.out.println("FPS: " + frames);


                    System.out.println(pn);

                    frames = 0;
                }
            }

            if (can_render) {
                glClear(GL_COLOR_BUFFER_BIT);

                world.render(tiles, shader, camera);

                gui.render();
                window.swapBuffers();
                frames++;
            }
        }

        Assets.deleteAsset();

        glfwTerminate();

    }

    public static void main(String[] args) {
        new Main(1);
    }

}
