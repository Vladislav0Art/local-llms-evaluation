package org.jsoup.helper;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedTestDecodePart {

    @Test
    public void testDecodePart() {
        Test test = new Test();
        String asciiString = "Hello, World!";
        char[] nonASCIIChars = {',', ' '};// Replace with actual non-ASCII characters
        test.decodePart(nonASCIIChars);
        assertEquals(asciiString, test.getOutput());
    }

    public class Test {

        private StringBuilder output = new StringBuilder();

        public void decodePart(char[] chars) {
            for (char c : chars) {
                if (!Character.isASCII(c)) {
                    output.append("Non-ASCII character: ").append(c).append("\n");
                }
            }
        }

        public String getOutput() {
            return output.toString();
        }
    }

}