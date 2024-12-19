package org.jsoup.nodes;

public class GeneratedConstructorTest {

    @Test
    public void constructorTest() {
        String text = "Hello World";
        TextNode textNode = new TextNode(text);
        assertEquals(text, textNode.text());
    }

}