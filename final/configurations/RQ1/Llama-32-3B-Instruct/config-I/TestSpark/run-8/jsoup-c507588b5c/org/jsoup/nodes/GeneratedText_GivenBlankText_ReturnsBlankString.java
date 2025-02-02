package org.jsoup.nodes;

public class GeneratedText_GivenBlankText_ReturnsBlankString {

    @Test
    public void text_GivenBlankText_ReturnsBlankString() {
        String text = "\t";
        TextNode node = new TextNode(text);
        assertEquals(StringUtil.normaliseWhitespace("\t"), node.text());
    }

}