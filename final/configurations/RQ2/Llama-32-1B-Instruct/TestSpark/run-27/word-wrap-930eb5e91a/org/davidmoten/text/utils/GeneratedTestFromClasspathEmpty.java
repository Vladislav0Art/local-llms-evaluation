package org.davidmoten.text.utils;

public class GeneratedTestFromClasspathEmpty {

    @Test
    public void testFromClasspathEmpty() {
        Builder builder = WordWrap.fromClasspath("test.txt");
        String text = "";
        int maxWidth = 10;
        Function<CharSequence, Number> stringWidth = CharSequence::length;

        wordWrap(builder.reader(), builder.out(), "\n", maxWidth, stringWidth,
                new HashSet<>(), false, true);
    }

}