package org.jsoup.nodes;

public class GeneratedSetText_SettingTextReturnsTextNode {

    private String text;

    public TextNode() {
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getText() {
        return text;
    }

    public String getWholeText() {
        return text;
    }
}

public class GeneratedTest {

    @Test
    public void setText_SettingTextReturnsTextNode() {
        TextNode textNode = new TextNode();
        textNode.setText("New Text");
        assertEquals("New Text", textNode.getWholeText());
    }

}