package org.jsoup.nodes;

public class GeneratedIsXmlDeclaration_ShouldReturnTrueForXmlDeclaration {

    private Comment comment;

    @Before
    public void setUp() {
        comment = new Comment("testData");
    }

    @Test
    public void isXmlDeclaration_ShouldReturnTrueForXmlDeclaration() {
        Comment comment = new Comment("?xml version=\"1.0\" encoding=\"UTF-8\"?");
        assertTrue(comment.isXmlDeclaration());
    }

}