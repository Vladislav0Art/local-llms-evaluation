package org.davidmoten.text.utils;

public class GeneratedTest {

    @Test
    public void testFromUtf8() {
        Builder builder = new WordWrap.Builder("test.txt");
        String text = "This is a test string";
        int maxWidth = 10;
        Function<CharSequence, Number> stringWidth = CharSequence::length;

        builder.maxWidth(maxWidth).addSpaces().setIndent(0);
        wordWrap(builder, "", "\n", maxWidth, stringWidth, true);

        StringBuilder sb = new StringBuilder();
        for (char c : text.toCharArray()) {
            sb.append(c).append(" ");
        }
        String trimmedText = sb.toString().trim();

        assert trimmedText.equals(text) : "Trimmed text does not match original";

        builder.removeSpaces().setIndent(0);
        wordWrap(builder, "", "\n", maxWidth, stringWidth, false);
    }

    @Test
    public void testFromClasspath() {
        Builder builder = new WordWrap.Builder("test.txt");
        String text = "This is a test string";
        int maxWidth = 20;
        Function<CharSequence, Number> stringWidth = CharSequence::length;

        builder.maxWidth(maxWidth).addSpaces().setIndent(0);
        wordWrap(builder, "", "\n", maxWidth, stringWidth, true);

        builder.setLineBreaks(false).setIndent(0);
        wordWrap(builder, "", "\n", 20, stringWidth, true);

        StringBuilder sb = new StringBuilder();
        for (char c : text.toCharArray()) {
            sb.append(c).append(" ");
        }
        String trimmedText = sb.toString().trim();

        assert trimmedText.equals(text) : "Trimmed text does not match original";

        builder.setLineBreaks(true);
        wordWrap(builder, "", "\n", 20, stringWidth, false);

        builder.removeSpaces();
        builder.setIndent(0);
        wordWrap(builder, "", "\n", 20, stringWidth, true);
    }

    @Test
    public void testFromClasspathString() {
        WordWrap.Builder builder = new WordWrap.Builder("test.txt");
        String text = "This is a test string";
        int maxWidth = 10;
        Function<CharSequence, Number> stringWidth = CharSequence::length;

        builder.maxWidth(maxWidth).addSpaces().setIndent(0);
        wordWrap(builder, "", "\n", maxWidth, stringWidth, true);

        builder.setLineBreaks(false).setIndent(0);
        wordWrap(builder, "", "\n", 10, stringWidth, true);

        StringBuilder sb = new StringBuilder();
        for (char c : text.toCharArray()) {
            sb.append(c).append(" ");
        }
        String trimmedText = sb.toString().trim();

        assert trimmedText.equals(text) : "Trimmed text does not match original";

        builder.setLineBreaks(true);
        wordWrap(builder, "", "\n", 10, stringWidth, false);

        builder.removeSpaces();
        builder.setIndent(0);
        wordWrap(builder, "", "\n", 10, stringWidth, true);
    }

    @Test
    public void testFromClasspathStringEmpty() {
        WordWrap.Builder builder = new WordWrap.Builder("test.txt");
        String text = "";
        int maxWidth = 10;
        Function<CharSequence, Number> stringWidth = CharSequence::length;

        builder.maxWidth(maxWidth).addSpaces().setIndent(0);
        wordWrap(builder, "", "\n", maxWidth, stringWidth, true);

        builder.setLineBreaks(false).setIndent(0);
        wordWrap(builder, "", "\n", 10, stringWidth, true);

        StringBuilder sb = new StringBuilder();
        for (char c : text.toCharArray()) {
            sb.append(c).append(" ");
        }
        String trimmedText = sb.toString().trim();

        assert trimmedText.equals(text) : "Trimmed text does not match original";

        builder.setLineBreaks(true);
        wordWrap(builder, "", "\n", 10, stringWidth, false);

        builder.removeSpaces();
        builder.setIndent(0);
        wordWrap(builder, "", "\n", 10, stringWidth, true);
    }

}