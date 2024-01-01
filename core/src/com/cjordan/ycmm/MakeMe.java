package com.cjordan.ycmm;

import com.badlogic.gdx.Game;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.utils.ScreenUtils;
import com.cjordan.ycmm.resources.Assets;
import com.cjordan.ycmm.screens.GameScreen;

public class MakeMe extends Game {
    private SpriteBatch batch;
    private Assets assets;

    // Screens
    private GameScreen gameScreen;

    public GameScreen getGameScreen() {
        return gameScreen;
    }

    public SpriteBatch getBatch() {
        return batch;
    }

    public Assets getAssets() {
        return assets;
    }

    @Override
    public void create() {
        batch = new SpriteBatch();
        assets = new Assets();

        // Load all assets
        assets.load();
        assets.getManager().finishLoading();

        gameScreen = new GameScreen(this);
        setScreen(gameScreen);
    }

    @Override
    public void render() {
        super.render();
    }

    @Override
    public void dispose() {
        batch.dispose();
        assets.dispose();
    }
}
