package gui;

import org.joml.Vector2f;

import io.Input;
import io.Window;
import org.newdawn.slick.UnicodeFont;
import render.*;


import org.newdawn.slick.TrueTypeFont;
import java.awt.*;

public class Gui {
    private Shader shader;
    private Camera camera;
    private TileSheet sheet;

    private Button temporary;

    public Gui(Window window) {
        shader = new Shader("gui");
        camera = new Camera(window.getWidth(), window.getHeight());
        sheet = new TileSheet("gui.png", 9);

        //temporary = new Button(new Vector2f(-32, -32), new Vector2f(96, 96));

        Font AWTfont = new Font("Times New Roman",Font.BOLD,24);
        UnicodeFont font = new UnicodeFont(AWTfont);
        font.drawString(5,5,"sex");
    }

    public void resizeCamera(Window window) {
        camera.setProjection(window.getWidth(), window.getHeight());
    }

    public void update(Input input) {
        //temporary.update(input);
    }

    public void render() {
        shader.bind();
        //temporary.render(camera, sheet, shader);//버튼 화면에 표시
    }
}