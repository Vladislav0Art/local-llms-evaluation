package org.jsoup.nodes;

public class GeneratedIsXmlDeclarationTest {

    @Test
    public void isXmlDeclarationTest() {
        Comment comment = new Comment("!This is an XML Declaration");
        assertTrue(comment.isXmlDeclaration());

        comment = new Comment("?This is not an XML Declaration");
        assertFalse(comment.isXmlDeclaration());

        comment = new Comment("");
        assertFalse(comment.isXmlDeclaration());
    }

}