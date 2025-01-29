package org.davidmoten.text.utils;

public class GeneratedTestFromClasspathStringEmpty {

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