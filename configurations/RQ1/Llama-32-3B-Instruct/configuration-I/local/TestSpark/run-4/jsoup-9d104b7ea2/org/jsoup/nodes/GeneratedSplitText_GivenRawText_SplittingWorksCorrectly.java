package org.jsoup.nodes;

public class GeneratedSplitText_GivenRawText_SplittingWorksCorrectly {


    private TextNode textNode;

    @Before
    public void setupTextNode() {
        String text = "Hello World";
        this.textNode = new TextNode(text);
    }

    @Test
    public void SplitText_GivenRawText_SplittingWorksCorrectly() {
        String text = "Hello World";
        this.textNode = new TextNode(text);
        int offset = 7;
        TextNode tailNode = this.textNode.splitText(offset);
        assertEquals("Hello", this.textNode.value());
        assertEquals("World", tailNode.value());
    }

}