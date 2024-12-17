package org.jsoup.helper;

public class GeneratedTestNonASCIICharacter {

    @Test
    public void testNonASCIICharacter() {
        Test test = new Test();
        String asciiString = "Hello, World!";
        char[] nonASCIIChars = {',', ' '};// Replace with actual non-ASCII characters
        String expectedOutput = "Hello, World!"; // Replace with actual expected output

        test.decodePart(nonASCIIChars);
    }

    public class Test {
        public void decodePart(char[] chars) throws UnsupportedEncodingException {
            for (char c : chars) {
                if (!Character.isASCII(c)) {
                    System.out.println("Non-ASCII character: " + c);
                }
            }
        }
    }

}