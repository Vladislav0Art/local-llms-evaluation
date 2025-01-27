package org.jsoup.nodes;

public class GeneratedAsXmlDeclarationReturnsNull {

    private static final String TEST_DATA = "Test Data";

    @Test
    public void asXmlDeclarationReturnsNull() {
        Comment comment = new Comment(TEST_DATA);
        assertNull(comment.asXmlDeclaration());
    }

}