package org.davidmoten.text.utils;

public class GeneratedTestFromUtf8 {

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

}