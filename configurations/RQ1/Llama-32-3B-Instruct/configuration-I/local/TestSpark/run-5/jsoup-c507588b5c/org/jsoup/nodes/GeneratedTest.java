package org.jsoup.nodes;

public class GeneratedTest {

    public static class Node {
        private String nodeName;
        private String text;

        public Node(String nodeName, String text) {
            this.nodeName = nodeName;
            this.text = text;
        }

        public String nodeName() {
            return nodeName;
        }

        public String text() {
            return text;
        }
    }

    public static class TextNode implements Node {
        private String text;
        private Node parentNode;

        public TextNode(String text) {
            this.text = text;
        }

        @Override
        public String nodeName() {
            return "#text";
        }

        public String text() {
            return text;
        }
    }

    public static class StringUtil {

        public static boolean isBlank(String text) {
            return text == null || text.isEmpty();
        }
    }

    public static class Test {
        public static void assertEquals(String expected, String actual) {
            if (!expected.equals(actual)) {
                throw new AssertionError("Expected " + expected + ", but got " + actual);
            }
        }

        public static void assertTrue(boolean condition) {
            if (!condition) {
                throw new AssertionError("Expected true, but got false");
            }
        }

        public static void assertFalse(boolean condition) {
            if (condition) {
                throw new AssertionError("Expected false, but got true");
            }
        }
    }

}