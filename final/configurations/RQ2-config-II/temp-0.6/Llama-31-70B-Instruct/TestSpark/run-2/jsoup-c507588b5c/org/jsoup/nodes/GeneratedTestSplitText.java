package org.jsoup.nodes;

public class GeneratedTestSplitText {

    private TextNode textNode;

    @Before
    public void setup() {
        textNode = new TextNode("Some text");
    }

    @Test
    public void testSplitText() {
        TextNode splitTextNode = textNode.splitText(5);
        assertEquals("Some ", textNode.getWholeText());
        assertEquals("text", splitTextNode.getWholeText());
    }

}