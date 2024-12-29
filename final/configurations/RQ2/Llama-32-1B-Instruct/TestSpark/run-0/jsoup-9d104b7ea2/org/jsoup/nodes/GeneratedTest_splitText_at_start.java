package org.jsoup.nodes;

public class GeneratedTest_splitText_at_start {

    private TextNode node;
    private Document document;

    @Before
    public void setup() {
        document = new Document();
    }

    public static class SplitTest extends TextNodeTest {

        @Test
        public void test_splitText_at_start() {
            node = createSplitText("Hello World");
            assertEquals(2, node.splitText(0));
            assertNotNull(node.getWholeText());
        }
    }

    public static class SplitTest_1 extends TextNodeTest {

        @Override
        protected String nodeName() {
            return "splitText";
        }

        @Override
        protected String text() {
            return "Hello World";
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

    public static class SplitTest_2 extends TextNodeTest {

        @Override
        protected String nodeName() {
            return "splitText";
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
            return true;
        }
    }

    public static class SplitTest_3 extends TextNodeTest {

        private Node[] nodes;

        @Before
        public void setup() {
            document.append("Hello World");
            node = createSplitText("World");
            nodes = new Node[node.getWholeText().length()];
            int index = 0;
            for (int i = 0; i < node.getWholeText().length(); i++) {
                nodes[i] = new Node(node.getWholeText().substring(index, index + 1));
                index += 2;
            }
        }

    }