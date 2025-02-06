package org.jsoup.nodes;

public class GeneratedIsXmlDeclarationReturnsExpectedValue {

    private Comment comment;

    @Before
    public void setUp() {
        comment = new Comment("data");
    }

    @Test
    public void isXmlDeclarationReturnsExpectedValue() {
        assertTrue(comment.isXmlDeclaration());
    }

}