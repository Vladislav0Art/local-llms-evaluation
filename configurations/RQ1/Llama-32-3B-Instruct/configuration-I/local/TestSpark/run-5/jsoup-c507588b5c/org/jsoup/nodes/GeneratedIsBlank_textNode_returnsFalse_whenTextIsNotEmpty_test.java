package org.jsoup.nodes;

public class GeneratedIsBlank_textNode_returnsFalse_whenTextIsNotEmpty_test {

    public static class TextNode {
        private String text;
        private Node parentNode;

        public TextNode(String text) {
            this.text = text;
        }

        public String text() {
            return text;
        }

        public boolean isBlank() {
            return StringUtil.isBlank(text);
        }

        public String splitText(int offset) {
            return StringUtil.splitTextAtMiddle(text, offset);
        }
    }

    public static class StringUtil {

        public static boolean isBlank(String text) {
            if (text == null || text.isEmpty()) {
                return true;
            }
            for (int i = 0; i < text.length(); i++) {
                char c = text.charAt(i);
                if (!Character.isWhitespace(c)) {
                    break;
                }
                if (i == text.length() - 1 && Character.isWhitespace(text.charAt(i))) {
                    continue;
                }
                return false;
            }
            return true;
        }

        public static String splitTextAtBeginning(String text, int offset) {
            if (offset < 0 || offset > text.length()) {
                return "";
            }
            return text.substring(0, offset);
        }

        public static String splitTextAtMiddle(String text, int offset) {
            if (offset < 0 || offset > text.length()) {
                return "";
            }
            return text.substring(offset + 1);
        }

        public static String splitTextAtEnd(String text, int offset) {
            if (offset < 0 || offset > text.length()) {
                return "";
            }
            return text.substring(offset);
        }
    }

    @org.junit.Test
    public void textNode_creation_test() {
        String text = "Hello World!";
        TextNode textNode = new TextNode(text);
        assertEquals(text, textNode.text());
    }

    @Test
    public void isBlank_textNode_returnsFalse_whenTextIsNotEmpty_test() {
        String text = "Hello";
        TextNode textNode = new TextNode(text);
        assertFalse(textNode.isBlank());
    }

}