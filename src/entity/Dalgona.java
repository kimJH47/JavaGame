package entity;

import io.Window;
import render.Animation;
import render.Camera;
import world.World;

public class Dalgona extends Entity{
    public static final int ANIM_SIZE = 1;

    public Dalgona(Transform transform,int level) {
        super(ANIM_SIZE, transform);
        this.bounding_box=null;
        if(level == 0)
            setAnimation(0, new Animation(1, 1, "dalgona/inside"));
        else if(level == 1)
            setAnimation(0, new Animation(1, 1, "dalgona/deep"));
    }

    @Override
    public void update(float delta, Window window, Camera camera, World world) {

    }
}
