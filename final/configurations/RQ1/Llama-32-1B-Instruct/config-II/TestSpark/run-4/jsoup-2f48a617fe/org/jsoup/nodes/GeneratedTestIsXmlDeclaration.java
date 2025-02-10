package org.jsoup.nodes;

public class GeneratedTestIsXmlDeclaration {

    @Test
    public void testIsXmlDeclaration() {
        String data = "This is a comment";
        boolean result = Comment.isXmlDeclaration(data);
        assertEquals(true, result);
    }

}