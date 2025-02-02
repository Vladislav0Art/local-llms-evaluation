package org.jsoup.nodes;

public class Generated[TextNodeCreation][WithBlankText]

Test {

    private TextNode textNode;

    @Test
    public void [TextNodeCreation][WithBlankText]Test() {
        String text = "";
        textNode = new TextNode(text);
        assertTrue(textNode.isBlank());
        assertEquals("", textNode.text());
    }

}