package org.davidmoten.text.utils;

public class GeneratedLeftTrim_builder {

    @Test
    public void leftTrim_builder() {
        StringBuilder builder = new StringBuilder("   Hello World   ");
        WordWrap.Builder expectedBuilder = new WordWrap.Builder();
        expectedBuilder.leftTrim(builder.toString());
        assertEquals(expectedBuilder.build(), builder.toString());
    }
}

public class WordWrap {

    private String input;

    public static WordWrap from(StringReader reader) {
        return new WordWrap(reader);
    }

    public static WordWrap fromClasspathUtf8(String input) throws IOException {
        // implement logic to load string from classpath
        return new WordWrap(input);
    }

    public static WordWrap fromFile(String input) throws IOException {
        // implement logic to load string from file
        return new WordWrap(input);
    }

    private WordWrap(StringReader reader) {
        this.input = reader.toString();
    }

    private WordWrap(String input) {
        this.input = input;
    }

    public String rightTrim() {
        int index = input.lastIndexOf(' ');
        if (index == -1) {
            return input;
        }
        return input.substring(index + 1);
    }

    public static class Builder {
        private StringBuilder string;

        public void leftTrim(StringBuilder builder) {
            this.string = new StringBuilder();
            this.string.append(builder.substring(0, builder.indexOf(' ')));
        }

        public String build() {
            return string.toString();
        }
    }

}