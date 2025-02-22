package org.jsoup.nodes;

public class GeneratedTestIsXmlDeclaration {

    private Comment comment;
    private String data;

    @Before
    public void setUp() {
        data = "This is a test.";
        comment = new Comment(data);
    }

    @Test
    public void testIsXmlDeclaration() {
        assertFalse(comment.isXmlDeclaration());
    }

}