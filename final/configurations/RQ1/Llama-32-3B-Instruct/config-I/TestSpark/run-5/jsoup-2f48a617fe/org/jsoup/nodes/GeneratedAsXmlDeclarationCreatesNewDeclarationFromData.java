package org.jsoup.nodes;

public class GeneratedAsXmlDeclarationCreatesNewDeclarationFromData {

    private static final String EMPTY_COMMENT = "#comment";

    @Test
    public void asXmlDeclarationCreatesNewDeclarationFromData() {
        String data = "<declaration>";
        XmlDeclaration decl = new XmlDeclaration(data, true);
        Comment comment = new Comment(data);
        Assert.assertEquals(Comment.asXmlDeclaration(comment), decl);
    }

}