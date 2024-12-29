package org.jsoup.nodes;

public class GeneratedTest_stripLeadingWhitespace {

    private TextNode node;
    private Document document;

    @Before
    public void setup() {
        document = new Document();
    }

    public static class SplitTest extends TextNodeTest {

        @Test
        public void test_stripLeadingWhitespace() {
            assertEquals("Hello World", node.toString());
        }
    }

    public static class LastCharIsWhitespaceTest extends TextNodeTest {

        private Node node;

        @Before
        public void setup() {
            document.append("abc");
            node = createLastCharIsWhitespace("");
        }

    }