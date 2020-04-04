package com.archieruin.starroad.entities;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.math.Vector2;

public class Enemy extends Entity {
    private Texture texture;

    public Enemy(Texture texture, Vector2 position, float speed) {
        super(texture, position, speed);
    }


}
