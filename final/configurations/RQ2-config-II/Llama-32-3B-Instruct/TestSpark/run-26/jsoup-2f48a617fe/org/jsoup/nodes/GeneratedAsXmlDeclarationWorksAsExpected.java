package org.jsoup.nodes;

public class GeneratedAsXmlDeclarationWorksAsExpected {

    private Comment comment;

    @Before
    public void setUp() {
        comment = new Comment("data");
    }

    @Test
    public void asXmlDeclarationWorksAsExpected() {
        XmlDeclaration expectedDeclaration = new XmlDeclaration("data");
        Comment commentToTest = new Comment("<!-- data -->");
        assertEquals(expectedDeclaration, commentToTest.asXmlDeclaration());
    }

}