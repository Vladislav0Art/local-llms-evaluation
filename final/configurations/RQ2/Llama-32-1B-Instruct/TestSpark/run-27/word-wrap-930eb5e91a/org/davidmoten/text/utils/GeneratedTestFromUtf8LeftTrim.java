package org.davidmoten.text.utils;

public class GeneratedTestFromUtf8LeftTrim {

    @Test
    public void testFromUtf8LeftTrim() {
        Builder builder = WordWrap.fromClasspathUtf8("test.txt");
        String text = "   This is a test string";
        int maxWidth = 10;
        Function<CharSequence, Number> stringWidth = CharSequence::length;

        wordWrap(builder.reader(), new StringBuilder(0).append("\n"), maxWidth,
                stringWidth, new HashSet<>(), false, true);
    }

}