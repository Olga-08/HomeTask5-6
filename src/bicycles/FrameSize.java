package bicycles;

public enum FrameSize {
    SIZE_13 (130, 145),
    SIZE_14 (135, 155),
    SIZE_15 (145, 160),
    SIZE_16 (150, 165),
    SIZE_17 (156, 170),
    SIZE_18 (167, 178),
    SIZE_19 (172, 180),
    SIZE_20 (178, 185),
    SIZE_21 (180, 190),
    SIZE_22 (185, 195),
    SIZE_23 (190, 200),
    SIZE_24 (195, 210);

    private final int MIN_HEIGHT;
    private final int MAX_HEIGHT;

    FrameSize (int min, int max) {
        MIN_HEIGHT = min;
        MAX_HEIGHT = max;
    }

    public int getMinHeight() {
        return MIN_HEIGHT;
    }

    public int getMaxHeight() {
        return MAX_HEIGHT;
    }
}
