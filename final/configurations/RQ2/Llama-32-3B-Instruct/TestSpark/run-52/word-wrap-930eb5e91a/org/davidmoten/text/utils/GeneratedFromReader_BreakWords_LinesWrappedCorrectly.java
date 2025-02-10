package org.davidmoten.text.utils;

public class GeneratedFromReader_BreakWords_LinesWrappedCorrectly {

    @Test
    public void fromReader_BreakWords_LinesWrappedCorrectly() throws IOException {
        WordWrap.Builder builder = new WordWrap.Builder();
        Preconditions.checkNotNull(builder.from(new ArrayList<>()));
        StringBuilder out = new StringBuilder();
        Preconditions.checkNotNull(WordWrap.wordWrap(builder.in(), out, "\n", 10L,
                s -> s.length(), new HashSet<>(List.of(' ')), true, true));
        Preconditions.assertTrue(out.toString().contains("\n"));
    }

}