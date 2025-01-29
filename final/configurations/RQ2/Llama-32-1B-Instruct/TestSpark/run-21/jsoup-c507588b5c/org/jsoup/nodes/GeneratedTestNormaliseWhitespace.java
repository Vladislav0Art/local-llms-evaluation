package org.jsoup.nodes;

public class GeneratedTestNormaliseWhitespace {

    @Test
    public void testNormaliseWhitespace() throws IOException, Exception {
        String text = "   Hello World  ";
        String result = TextNode.normaliseWhitespace(text);
        assertEquals("Hello World", result);
    }

}