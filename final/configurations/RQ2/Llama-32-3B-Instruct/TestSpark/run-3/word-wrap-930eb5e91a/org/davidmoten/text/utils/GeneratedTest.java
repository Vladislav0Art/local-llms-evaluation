package org.davidmoten.text.utils;

public class GeneratedTest {

    private String wrappedText;

    public static WordWrap from(String[] text) {
        StringBuilder builder = new StringBuilder();
        for (String s : text) {
            if (!builder.toString().isEmpty()) {
                builder.append(" ");
            }
            builder.append(s);
        }
        return new WordWrap(builder.toString());
    }

    public static WordWrap from(CharSequence text) {
        return new WordWrap(text.toString());
    }

    public String wrapText(String input) {
        int spaceIndex = input.indexOf(' ');
        if (spaceIndex == -1) {
            return input;
        } else {
            String firstHalf = input.substring(0, spaceIndex);
            String secondHalf = input.substring(spaceIndex + 1);
            return firstHalf + '\n' + secondHalf;
        }
    }

    public static String trimRight(String input) {
        StringBuilder sb = new StringBuilder(input);
        int lastSpaceIndex = sb.lastIndexOf(' ');
        if (lastSpaceIndex == -1) {
            return sb.toString();
        } else {
            return sb.substring(0, lastSpaceIndex + 1).trimRight();
        }
    }

    public String trimRight() {
        return trimRight(this.wrappedText);
    }
}

public class GeneratedTest {

    @Test
    public void fromClasspathUtf8ShouldReturnBuilder() {
        WordWrap.Builder builder = WordWrap.fromClasspathUtf8("Hello World");
        assertNotNull(builder);
    }

    @Test
    public void isWhitespaceStringContainsWhitespaceChar() {
        assertTrue(WordWrap.isWhitespace("   "));
    }

    @Test
    public void isWhitespaceStringDoesNotContainWhitespaceChar() {
        assertFalse(WordWrap.isWhitespace("Hello World"));
    }

}