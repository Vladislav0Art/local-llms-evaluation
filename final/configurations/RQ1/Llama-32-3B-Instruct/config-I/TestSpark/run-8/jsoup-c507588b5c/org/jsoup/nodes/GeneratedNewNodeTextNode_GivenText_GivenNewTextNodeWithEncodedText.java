package org.jsoup.nodes;

public class GeneratedNewNodeTextNode_GivenText_GivenNewTextNodeWithEncodedText {

    @Test
    public void newNodeTextNode_GivenText_GivenNewTextNodeWithEncodedText() {
        String text = "test";
        TextNode newNode = TextNode.createFromEncoded(text);
        assertEquals(text, StringUtil.normaliseWhitespace(newNode.text()));
    }

}