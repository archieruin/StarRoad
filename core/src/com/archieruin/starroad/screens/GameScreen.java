package com.archieruin.starroad.screens;

import com.archieruin.starroad.Main;
import com.archieruin.starroad.controllers.PlayerInput;
import com.archieruin.starroad.entities.Player;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.math.Rectangle;
import com.badlogic.gdx.math.Vector2;


public class GameScreen implements Screen {
    private OrthographicCamera cam;
    private SpriteBatch batch;
    private Player player;
    private Texture playerTexture;
    private Texture background;

    public GameScreen() {
        cam = new OrthographicCamera(Main.WIDTH, Main.HEIGHT);
        batch = new SpriteBatch();

        playerTexture = new Texture("player.png");
//        Texture enemyTexture = new Texture("enemy.png");
        background = new Texture("background.png");

        player = new Player(playerTexture, new Vector2(50, 50), 100f);
//        enemy = new Player(playerTexture, new Vector2(50, 50), 50.0f);

        PlayerInput playerInput = new PlayerInput(player);
        Gdx.input.setInputProcessor(playerInput);
    }

    @Override
    public void show() {

    }

    @Override
    public void render(float delta) {
        Gdx.gl.glClearColor(0.15f, 0.15f, 0.15f, 1);
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);

        cam.update();
        float new_cam_x = player.getPosition().x + playerTexture.getWidth() / 2;
        float new_cam_y = player.getPosition().y + playerTexture.getHeight() / 2;
        cam.position.set(new_cam_x, new_cam_y, 0);

        update(delta);

        batch.setProjectionMatrix(cam.combined);
        batch.begin();
        batch.draw(background, 0,0, Main.WIDTH, Main.HEIGHT);
        player.draw(batch);
        batch.end();

    }

    private void update(float delta) {
        player.update(delta);
    }

    @Override
    public void resize(int width, int height) {

    }

    @Override
    public void pause() {

    }

    @Override
    public void resume() {

    }

    @Override
    public void hide() {

    }

    @Override
    public void dispose() {
        batch.dispose();
        player.dispose();
    }
}
