package org.jsoup.nodes;

public class GeneratedAsXmlDeclarationEmptyDataTest {

    @Test
    public void asXmlDeclarationEmptyDataTest() {
        Comment comment = new Comment("");
        assertNull(comment.asXmlDeclaration());
    }

}