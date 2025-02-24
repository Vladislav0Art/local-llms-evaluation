package org.jsoup.nodes;

public class GeneratedAsXmlDeclarationTest {

    private Comment comment;

    @Test
    public void asXmlDeclarationTest() {
        comment = new Comment("data");
        assertNull(comment.asXmlDeclaration());
    }

}