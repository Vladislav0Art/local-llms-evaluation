package org.davidmoten.text.utils;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GeneratedTestWordWrap {

    @Test
    public void testWordWrap() {
        WordWrap wordWrap = new WordWrap();
        assertEquals("", wordWrap.leftTrim(new StringBuilder()));
        assertEquals(" ", wordWrap.rightTrim(new StringBuilder()));
        assertEquals("", ((StringBuilder) wordWrap.leftTrim(new StringBuilder())).toString());
        assertEquals(" ", ((StringBuilder) wordWrap.rightTrim(new StringBuilder())).toString());
        assertEquals(0, (((java.util.ArrayList) wordWrap.writer).size()));
    }

    public class WordWrap {

        private java.util.ArrayList<StringBuilder> buffer;

        public WordWrap() {
            this.buffer = new java.util.ArrayList<>();
        }

        public String leftTrim(StringBuilder sb) {
            if (sb != null && !sb.isEmpty()) {
                StringBuilder result = new StringBuilder();
                for (char c : sb.toString().toCharArray()) {
                    if (Character.isWhitespace(c)) {
                        break;
                    }
                    result.append(c);
                }
                return result.toString();
            } else {
                return "";
            }
        }

        public String rightTrim(StringBuilder sb) {
            if (sb != null && !sb.isEmpty()) {
                StringBuilder result = new StringBuilder(sb.toString());
                int start = result.lastIndexOf(' ');
                if (start == -1) {
                    return result.toString();
                }
                result.deleteCharAt(start);
                return result.toString();
            } else {
                return "";
            }
        }

        public String leftTrim(String sb) {
            StringBuilder sbBuilder = new StringBuilder(sb);
            return this.leftTrim(sbBuilder);
        }

        public String rightTrim(String sb) {
            StringBuilder sbBuilder = new StringBuilder(sb);
            return this.rightTrim(sbBuilder);
        }

        public String from(java.io.ByteArrayInputStream input, boolean wrapLines) {
        }

        public java.util.ArrayList<StringBuilder> writer() {
            return buffer;
        }

        public void close() {
        }
    }

}