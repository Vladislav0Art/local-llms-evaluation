package org.davidmoten.text.utils;

public class GeneratedTestGeneratedTest {

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

    private WordWrap(String wrappedText) {
        this.wrappedText = wrappedText;
    }

    public String getWrappedText() {
        return wrappedText;
    }
}

public class GeneratedTest {

    @Test
    public void testGeneratedTest() {
        WordWrap wordWrap = WordWrap.from(new String[]{"Hello", "World"});
        assertNotNull(wordWrap);

        try (WordWrap temp = new WordWrap(wordWrap.getWrappedText())) {
            assertNotNull(temp);
        }

        String result = WordWrap.trimRight("Hello,World!");
        assertEquals("Hello,", result);
    }

}