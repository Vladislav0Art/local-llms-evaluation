package org.jsoup.nodes;

public class GeneratedTextSetsTextContent {

    @Test
    public void textSetsTextContent() {
        // given
        TextNode textNode = new TextNode();
        String text = "New Text";

        // when
        textNode.text(text);

        // then
        assertEquals(text, textNode.text());
    }

}