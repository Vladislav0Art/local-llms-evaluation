package org.davidmoten.text.utils;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedTestEqualsAndBuild {

    @Test
    public void testEqualsAndBuild() {
        String input = "Hello World";
        WordWrap.Builder builder = WordWrap.fromClasspathUtf8(input);
        assertEquals(builder.build(), builder.toString());
    }
}

class WordWrap {

    static class Builder {
        private StringBuilder string;

        public Builder(String input) {
            this.string = new StringBuilder(input);
        }

        public String substring(int index) {
            return string.substring(index, index + 1);
        }

        public void leftTrim() {
            if (string.length() > 0) {
                string.deleteCharAt(0);
            }
        }

        public StringBuilder toString() {
            return string;
        }

        public StringBuilder build() {
            return string;
        }
    }

    static Builder from(String input) {
        return new Builder(input);
    }

    static Builder fromClasspathUtf8(String input) {
        // implementation
        return null;
    }

    static String rightTrim(String input) {
        int spaceIndex = input.lastIndexOf(' ');
        if (spaceIndex == -1) {
            return input;
        } else {
            return input.substring(spaceIndex + 1);
        }
    }

}