package game;

/**
 * Created by oxana_bs on 11.4.2016 г..
 */

import java.awt.Graphics2D;

import IO.Input;

public abstract class Entity {

    protected final EntityType type;

    protected float x;
    protected float y;

    public Entity(EntityType type, float x, float y) {
        this.type = type;
        this.x = x;
        this.y = y;
    }

    public abstract void update(Input input);

    public abstract void render(Graphics2D g);

}