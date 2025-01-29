package org.davidmoten.text.utils;

public class GeneratedTestBreakWords {

    @Test
    public void TestBreakWords() {
        Preconditions.checkArgument(minMaxWidth(50, 150), "Minimum maximum width is 50 and maximum is 150");
        WordWrap.from("text", StandardCharsets.UTF_8, "\n", 100, (s) -> Integer.parseInt(s.split("\\s+")[0]), new HashSet<>(), false, true);
    }

}