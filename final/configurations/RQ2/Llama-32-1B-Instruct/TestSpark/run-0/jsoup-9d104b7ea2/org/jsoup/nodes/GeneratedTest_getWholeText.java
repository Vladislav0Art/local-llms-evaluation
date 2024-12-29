package org.jsoup.nodes;

public class GeneratedTest_getWholeText {

    private TextNode node;
    private Document document;

    @Before
    public void setup() {
        document = new Document();
    }

    public static class SplitTest extends TextNodeTest {

        @Test
        public void test_getWholeText() {
            assertEquals("Hello World", nodes[0].toString());
            assertEquals("World", nodes[1].toString());
        }
    }

    public static class NormaliseWhitespaceTest extends TextNodeTest {

        private Node node;

        @Before
        public void setup() {
            document.append("Hello World");
            node = createNormaliseWhitespace("   Hello  World  ");
        }

    }