package org.jsoup.nodes;

public class GeneratedTestEncodedText {

    @Test
    public void testEncodedText() {
        TextNode textNode = new TextNode(TextUtils.fromHtml("<b>Hello</b> World"));
        assertTrue(textNode.isBlank());
    }

}