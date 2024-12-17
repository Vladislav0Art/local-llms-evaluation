package org.jsoup.nodes;

public class GeneratedTestGetWholeText {

    @Test
    public void testGetWholeText() {
        MockTextNode textNode = new MockTextNode();
        textNode.text("Hello");
        String expectedValue = "Hello";
        assertEquals(expectedValue, textNode.getWholeText());
    }

}