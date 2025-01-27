package org.davidmoten.text.utils;

public class GeneratedTest_leftTrim {

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
    public void test_leftTrim() {
        StringBuilder word = new StringBuilder();
        WordWrap.leftTrim(word, "   Hello World!  ");
        assertEquals("   Hello World!", word.toString());
    }

}