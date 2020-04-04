package com.archieruin.starroad.controllers;

import com.archieruin.starroad.Main;
import com.archieruin.starroad.entities.Player;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input.Keys;
import com.badlogic.gdx.InputProcessor;

public class PlayerInput implements InputProcessor {

    private Player player;

    public PlayerInput(Player player) {
        this.player = player;
    }

    @Override
    public boolean keyDown(int keycode) {
        switch (keycode) {
            case Keys.W:
                player.setMoveUp(true);
                break;
            case Keys.S:
                player.setMoveDown(true);
                break;
            case Keys.A:
                player.setMoveLeft(true);
                break;
            case Keys.D:
                player.setMoveRight(true);
                break;
            case Keys.ESCAPE:
                Gdx.graphics.setWindowedMode(Main.WIDTH * 2, Main.HEIGHT * 2);
        }
        return true;
    }

    @Override
    public boolean keyUp(int keycode) {
        switch (keycode) {
            case Keys.W:
                player.setMoveUp(false);
                break;
            case Keys.S:
                player.setMoveDown(false);
                break;
            case Keys.A:
                player.setMoveLeft(false);
                break;
            case Keys.D:
                player.setMoveRight(false);
                break;
        }
        return true;
    }

    @Override
    public boolean keyTyped(char character) {
        return false;
    }

    @Override
    public boolean touchDown(int screenX, int screenY, int pointer, int button) {
        return false;
    }

    @Override
    public boolean touchUp(int screenX, int screenY, int pointer, int button) {
        return false;
    }

    @Override
    public boolean touchDragged(int screenX, int screenY, int pointer) {
        return false;
    }

    @Override
    public boolean mouseMoved(int screenX, int screenY) {
        return false;
    }

    @Override
    public boolean scrolled(int amount) {
        return false;
    }
}
