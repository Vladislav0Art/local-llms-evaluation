package org.davidmoten.text.utils;

public class GeneratedTestWordWrap {

    @Test
    public void TestWordWrap() {
        Preconditions.checkArgument(minMaxWidth(50, 150), "Minimum maximum width is 50 and maximum is 150");
        wordWrap(System.in, System.out, "\n", 100, (s) -> Integer.parseInt(s.split("\\s+")[0]), new HashSet<>(), true, false);
    }

    private static int minMaxWidth(int min, int max) {
        return Math.min(min, max);
    }

}