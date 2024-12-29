package org.jsoup.nodes;

public class GeneratedTest_splitText_at_end {

    private TextNode node;
    private Document document;

    @Before
    public void setup() {
        document = new Document();
    }

    public static class SplitTest extends TextNodeTest {

        @Test
        public void test_splitText_at_end() {
            assertEquals(2, node.splitText(10));
            assertNotNull(node.getWholeText());
        }

    }