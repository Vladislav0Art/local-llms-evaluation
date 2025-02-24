package org.jsoup.nodes;

public class GeneratedIsXmlDeclarationTest {

    private Comment comment;

    @Test
    public void isXmlDeclarationTest() {
        comment = new Comment("data");
        assertFalse(comment.isXmlDeclaration());
    }

}