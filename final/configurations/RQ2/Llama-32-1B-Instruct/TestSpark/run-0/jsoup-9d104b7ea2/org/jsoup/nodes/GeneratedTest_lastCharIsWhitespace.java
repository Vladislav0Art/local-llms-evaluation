package org.jsoup.nodes;

public class GeneratedTest_lastCharIsWhitespace {

    private TextNode node;
    private Document document;

    @Before
    public void setup() {
        document = new Document();
    }

    public static class SplitTest extends TextNodeTest {

        @Test
        public void test_lastCharIsWhitespace() {
            assertEquals("a", node.toString());
        }
    }

    public static class LastCharIsWhitespaceTest_1 extends TextNodeTest {

        private Node node;

        @Override
        protected String nodeName() {
            return "lastCharIsWhitespace";
        }

        @Override
        protected String text() {
            return "";
        }

        @Override
        protected TextNode text(String text) {
            return new TextNode(text);
        }

        @Override
        public String getWholeText() {
            return text();
        }

        @Override
        public boolean isBlank() {
            return false;
        }
    }

    public static class LastCharIsWhitespaceTest_2 extends TextNodeTest {

        private Node node;

        @Override
        protected String nodeName() {
            return "lastCharIsWhitespace";
        }

        @Override
        protected String text() {
            return "abc";
        }

        @Override
        protected TextNode text(String text) {
            return new TextNode(text);
        }

        @Override
        public String getWholeText() {
            return text();
        }

        @Override
        public boolean isBlank() {
            return true;
        }
    }

}