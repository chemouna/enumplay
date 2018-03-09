package com.mounacheikhna.enumplay.font;

import java.io.File;
import java.util.Collection;
import java.util.Map;
import java.util.TreeMap;

public enum BasicMonoFont implements MonoFont {
    Courier("Courier", new File("/usr/share/fonts")),
    Consolas("Consolas", new File("/usr/share/fonts")),
    DejaVu("DejaVu", new File("/usr/share/fonts"));

    private final String fontName;
    private final File location;

    BasicMonoFont(String fontName, File location) {
        this.fontName = fontName;
        this.location = location;
    }

    public String getFontName() {
        return fontName;
    }

    public File getLocation() {
        return location;
    }

    private static Map<String, MonoFont> map = new TreeMap<>();

    static {
        for (MonoFont font : values()) {
            map.put(font.getFontName(), font);
        }
    }

    public static MonoFont monoFontFor(String fontName) {
        return map.get(fontName);
    }

    public static void addNewFont(MonoFont font) {
        if (!map.containsKey(font.getFontName())) {
            map.put(font.getFontName(), font);
        }
    }

    public static Collection<MonoFont> fonts() {
        return map.values();
    }
}
