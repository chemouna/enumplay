package com.mounacheikhna.enumplay.font;

import java.io.File;

public enum ExMonoFont implements MonoFont {

    Lucida("Lucida", new File("~/.fonts")), //
    Monaco("Monaco", new File("~/.fonts")), //
    Andale("Andale", new File("~/.fonts"));

    private final String fontName;
    private final File location;

    ExMonoFont(String fontName, File location) {
        this.fontName = fontName;
        this.location = location;
    }

    @Override
    public String getFontName() {
        return fontName;
    }

    @Override
    public File getLocation() {
        return location;
    }
}
