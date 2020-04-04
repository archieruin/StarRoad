package com.archieruin.starroad.entities;

import com.archieruin.starroad.Main;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.math.Vector2;

public class Player extends Entity {
    private boolean moveUp = false;
    private boolean moveDown = false;
    private boolean moveLeft = false;
    private boolean moveRight = false;
    private Vector2 direction;

    public Player(Texture texture, Vector2 position, float speed) {
        super(texture, position, speed);
        this.direction = new Vector2(0,0);
    }

    @Override
    public void draw(SpriteBatch batch) {
        super.draw(batch);
    }

    public void update(float delta) {

        if (moveUp)
            this.direction = new Vector2(0, 1);
        else if (moveDown)
            this.direction = new Vector2(0, -1);
        else if (moveLeft)
            this.direction = new Vector2(-1, 0);
        else if (moveRight)
            this.direction = new Vector2(1, 0);
        if (moveUp && moveLeft)
            this.direction = new Vector2(-1, 1);
        else if (moveUp && moveRight)
            this.direction = new Vector2(1, 1);
        else if (moveDown && moveLeft)
            this.direction = new Vector2(-1,-1);
        else if (moveDown && moveRight)
            this.direction = new Vector2(1, -1);

        velocity.set(direction.cpy());
        position.add(velocity.cpy().scl(speed).scl(delta));
        direction = new Vector2(0,0);

        if (position.x + texture.getWidth() > Main.WIDTH) {
            velocity.set(new Vector2(0,0));
            position.x = Main.WIDTH - texture.getWidth();
        }
        if (position.x < 0) {
            velocity = new Vector2(0,0);
            position.x = 0;
        }
        if (position.y + texture.getHeight() > Main.HEIGHT) {
            velocity.set(new Vector2(0,0));
            position.y = Main.HEIGHT - texture.getHeight();
        }
        if (position.y < 0) {
            velocity = new Vector2(0,0);
            position.y = 0;
        }
    }

    public void setMoveUp(boolean moveUp) {
        if (moveDown && moveUp) moveDown = false;
        this.moveUp = moveUp;
    }

    public void setMoveDown(boolean moveDown) {
        if (moveUp && moveDown) moveUp = false;
        this.moveDown = moveDown;
    }

    public void setMoveLeft(boolean moveLeft) {
        if (moveRight && moveLeft) moveRight = false;
        this.moveLeft = moveLeft;
    }

    public void setMoveRight(boolean moveRight) {
        if (moveLeft && moveRight) moveLeft = false;
        this.moveRight = moveRight;
    }

    public Vector2 getPosition() {
        return this.position;
    }
}
