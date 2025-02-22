package org.jsoup.nodes;

public class GeneratedIsXmlDeclaration_ShouldReturnFalseForNonXmlDeclaration {

    private Comment comment;

    @Before
    public void setUp() {
        comment = new Comment("testData");
    }

    @Test
    public void isXmlDeclaration_ShouldReturnFalseForNonXmlDeclaration() {
        assertFalse(comment.isXmlDeclaration());
    }

}