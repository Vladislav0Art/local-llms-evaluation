package org.jsoup.nodes;

public class GeneratedTextShouldNormalizeWhitespace {

    @Test
    public void textShouldNormalizeWhitespace() {
        TextNode node = new TextNode("   hello  ");
        String result = node.text();
        assertNotNull(result);
        assertEquals(StringUtil.normaliseWhitespace("   hello  "), result);
    }

}