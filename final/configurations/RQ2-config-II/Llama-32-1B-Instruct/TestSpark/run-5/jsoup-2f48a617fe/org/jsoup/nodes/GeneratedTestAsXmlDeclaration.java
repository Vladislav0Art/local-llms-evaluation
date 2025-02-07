package org.jsoup.nodes;

public class GeneratedTestAsXmlDeclaration {

    private Comment comment;

    @Before
    public void setup() {
        comment = new Comment("<!-- This is a comment -->");
    }

    @Test
    public void testAsXmlDeclaration() {
        XmlDeclaration xmlDecl = new XmlDeclaration();
        Comment comment = new Comment("<!-- This is a comment -->");
        comment.setData("");
        assertTrue(comment.asXmlDeclaration().equals(xmlDecl));
    }

}