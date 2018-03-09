package com.mounacheikhna.enumplay.font;

public class FontMain {

    public static void main(String[] args) {
        for (ExMonoFont exMonoFont : ExMonoFont.values()) {
            BasicMonoFont.addNewFont(exMonoFont);
        }

        for (MonoFont font : BasicMonoFont.fonts()) {
            System.out.println(font.getFontName());
        }
    }
}
