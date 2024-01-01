package com.cjordan.ycmm.resources;

import com.badlogic.gdx.assets.AssetManager;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.TextureAtlas;

public class Assets {
    // Asset Manager
    private final AssetManager manager = new AssetManager();

    // GAMEPLAY ASSETS
        // Sprites
    public static final String KING_WALK_SPRITE = "sprites/King_Walking.png";
    public static final String KING_WALK_ATLAS = "sprites/King_Walking.atlas";
        // Maps
    public static final String FLOOR = "world/floor.png";
        // Fonts
    public static final String ROBOTO_REG = "fonts/Roboto-Regular.ttf";
    public static final String SMALL_FONT = "smallFont.ttf";
    public static final String MED_FONT = "medFont.ttf";
    public static final String LARGE_FONT = "largeFont.ttf";

    public AssetManager manager() {
        return manager;
    }

    public void load() {
        // Load all assets.
        loadGameplayAssets();
    }

    private void loadGameplayAssets() {
        manager.load(FLOOR, Texture.class);
        manager.load(KING_WALK_SPRITE, Texture.class);
        manager.load(KING_WALK_ATLAS, TextureAtlas.class);
    }

    public void dispose() {
        manager.dispose();
    }
}
