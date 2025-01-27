package org.jsoup.nodes;

public class GeneratedTestText {

    private static final String DEFAULT = "DEFAULT";

    @Test
    public void testText() {
        Document document = new Document();
        TextNode textNode = document.createTextNode("test");
        String result = textNode.text();
        assertEquals("test", result);
    }
}

}