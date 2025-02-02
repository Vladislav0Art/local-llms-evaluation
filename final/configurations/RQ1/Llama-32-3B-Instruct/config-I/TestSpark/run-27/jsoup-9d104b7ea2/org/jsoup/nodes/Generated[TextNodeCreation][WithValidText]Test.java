package org.jsoup.nodes;

public class Generated[TextNodeCreation][WithValidText]

Test {

    private TextNode textNode;

    @Test
    public void [TextNodeCreation][WithValidText]Test() {
        String text = "Hello, World!";
        textNode = new TextNode(text);
        assertNotNull(textNode);
        assertEquals("Hello, World!", textNode.text());
    }

}