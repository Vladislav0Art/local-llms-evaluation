package org.davidmoten.text.utils;

public class GeneratedTest_rightTrim {

    public static String rightTrim(String input) {
        int start = input.lastIndexOf(' ');
        if (start == -1) {
            return input;
        } else {
            return input.substring(start + 1);
        }
    }

    public static void leftTrim(StringBuilder word, String input) {
        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            if (!Character.isWhitespace(c)) {
                word.setStart(i);
                return;
            }
        }
        word.setStart(0);
    }

}

public class GeneratedTest {

    @Test
    public void test_rightTrim() {
        String input = "   Hello World!  ";
        String expectedOutput = "Hello World!";
        assertEquals(expectedOutput, WordWrap.rightTrim(input));
    }

}