package org.jsoup.nodes;

public class GeneratedCreateTextNode_NullText_ThrowsNullPointerException {

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
    public void createTextNode_NullText_ThrowsNullPointerException() {
        try {
            new TextNode();
            fail("Expected NullPointerException");
        } catch (NullPointerException e) {
            // expected
        }
    }

}