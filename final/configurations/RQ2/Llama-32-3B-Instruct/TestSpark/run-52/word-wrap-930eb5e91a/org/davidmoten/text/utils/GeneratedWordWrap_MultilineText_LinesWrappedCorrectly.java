package org.davidmoten.text.utils;

public class GeneratedWordWrap_MultilineText_LinesWrappedCorrectly {

    @Test
    public void wordWrap_MultilineText_LinesWrappedCorrectly() throws IOException {
        WordWrap.Builder builder = new WordWrap.Builder();
        Preconditions.checkNotNull(builder.from(new ArrayList<>()));
        StringBuilder out = new StringBuilder();
        Preconditions.checkNotNull(WordWrap.wordWrap(builder.in(), out, "\n", 10L,
                s -> s.length(), new HashSet<>(List.of(' ')), false, true));
        Preconditions.assertTrue(out.toString().contains("\n"));
    }

}