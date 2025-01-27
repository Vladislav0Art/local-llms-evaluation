package org.jsoup.nodes;

public class GeneratedText_nullInput {

    @Test
    public void text_nullInput() {
        TextNode node = new TextNode();
        try {
            node.text(null);
            fail("NullPointerException expected");
        } catch (NullPointerException e) {
            // expected
        }
    }

}