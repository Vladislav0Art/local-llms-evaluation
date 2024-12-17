package org.jsoup.nodes;

public class GeneratedSetText_GivenRawText_SettingAndGettingTextWorksCorrectly {


    private TextNode textNode;

    @Before
    public void setupTextNode() {
        String text = "Hello World";
        this.textNode = new TextNode(text);
    }

    @Test
    public void SetText_GivenRawText_SettingAndGettingTextWorksCorrectly() {
        String text = "Hello World";
        this.textNode = new TextNode(text);
        assertEquals("#text", this.textNode.nodeName());
        assertEquals(text, this.textNode.value());

        this.textNode.setText("New Text");
        assertEquals("New Text", this.textNode.value());
    }

}