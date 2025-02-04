package com.capworld.formatter.config;

public enum Alignment {
    LEFT_ALIGN("left_align"),
    RIGHT_ALIGN("right_align"),
    CENTER("center"),
    HARD("hard"),
    UNKNOWN("unknown");

    public final String alignment;

    Alignment(String alignment) {
        this.alignment = alignment;
    }

    public static Alignment valueOfAlignment(String alignment) {
        for (Alignment a : values()) {
            if (a.alignment.equals(alignment)) {
                return a;
            }
        }
        return UNKNOWN;
    }
}
