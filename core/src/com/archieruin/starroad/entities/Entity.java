package com.archieruin.starroad.entities;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.math.Vector2;

abstract class Entity {
    Texture texture;
    Vector2 position;
    Vector2 velocity;
//    Vector2 dir;
    float speed;

    Entity(Texture texture, Vector2 position, float speed) {
        this.texture = texture;
        this.position = position;
        this.speed = speed;
        this.velocity = new Vector2(0,0);
//        this.dir = new Vector2(0,0).nor();
    }

    public void draw(SpriteBatch batch) {
        batch.draw(texture, position.x, position.y);
    }

    public void dispose() {
        texture.dispose();
    }
}
