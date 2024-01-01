package com.cjordan.ycmm;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.utils.ScreenUtils;
import com.cjordan.ycmm.resources.Assets;

public class MakeMe extends ApplicationAdapter {
    private SpriteBatch batch;
    private Assets assets;

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
        assets.manager().finishLoading();
    }

    @Override
    public void render() {
        ScreenUtils.clear(1, 0, 0, 1);
        batch.begin();
        batch.end();
    }

    @Override
    public void dispose() {
        batch.dispose();
        assets.dispose();
    }
}
