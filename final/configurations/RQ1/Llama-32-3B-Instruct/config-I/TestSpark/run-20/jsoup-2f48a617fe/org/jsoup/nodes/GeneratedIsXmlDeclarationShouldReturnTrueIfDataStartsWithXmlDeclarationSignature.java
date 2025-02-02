package org.jsoup.nodes;

public class GeneratedIsXmlDeclarationShouldReturnTrueIfDataStartsWithXmlDeclarationSignature {

    @Test
    public void isXmlDeclarationShouldReturnTrueIfDataStartsWithXmlDeclarationSignature() {
        Comment comment = new Comment("<!-- !xml declaration -->");
        assertTrue(comment.isXmlDeclaration());
    }

}