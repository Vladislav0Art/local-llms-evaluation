package org.jsoup.nodes;

public class GeneratedIsXmlDeclarationShouldReturnTrueForXMLDeclarations {

    @Test
    public void isXmlDeclarationShouldReturnTrueForXMLDeclarations() {
        String data = "<?xml version=\"1.0\" encoding=\"UTF-8\"?>";
        Comment comment = new Comment(data);
        assertTrue(comment.isXmlDeclaration());
    }

}