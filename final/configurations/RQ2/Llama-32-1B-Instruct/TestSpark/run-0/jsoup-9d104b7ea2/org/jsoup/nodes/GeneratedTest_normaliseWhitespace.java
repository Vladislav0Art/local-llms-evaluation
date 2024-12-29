package org.jsoup.nodes;

public class GeneratedTest_normaliseWhitespace {

    private TextNode node;
    private Document document;

    @Before
    public void setup() {
        document = new Document();
    }

    public static class SplitTest extends TextNodeTest {

        @Test
        public void test_normaliseWhitespace() {
            assertEquals("    Hello  World", node.toString());
        }
    }

    public static class StripLeadingWhitespaceTest extends TextNodeTest {

        private Node node;

        @Before
        public void setup() {
            document.append("   Hello World");
            node = createStripLeadingWhitespace("Hello World");
        }

    }