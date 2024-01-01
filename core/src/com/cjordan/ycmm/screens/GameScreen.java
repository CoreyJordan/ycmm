package com.cjordan.ycmm.screens;

import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.utils.ScreenUtils;
import com.cjordan.ycmm.MakeMe;
import com.cjordan.ycmm.resources.Assets;

public class GameScreen implements Screen {
    private final MakeMe game;

    // Background/Ring
    private Texture floorTexture;

    public GameScreen(MakeMe game) {
        this.game = game;
        createGameMap();
    }

    private void createGameMap() {
        // Get the floor textures from the asset manager.
        floorTexture = game.getAssets().getManager().get(Assets.FLOOR);
    }

    @Override
    public void show() {

    }

    @Override
    public void render(float delta) {
        ScreenUtils.clear(0, 0, 0, 1);
        game.getBatch().begin();
        game.getBatch().draw(floorTexture, 0, 0);
        game.getBatch().end();
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

    }
}
