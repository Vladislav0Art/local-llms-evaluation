package org.jsoup.nodes;

public class GeneratedTestAsXmlDeclaration {

    private Comment comment;

    @Before
    public void setUp() {
        comment = new Comment("Some comment");
    }

    @Test
    public void testAsXmlDeclaration() {
        assertNull(comment.asXmlDeclaration());
    }

}