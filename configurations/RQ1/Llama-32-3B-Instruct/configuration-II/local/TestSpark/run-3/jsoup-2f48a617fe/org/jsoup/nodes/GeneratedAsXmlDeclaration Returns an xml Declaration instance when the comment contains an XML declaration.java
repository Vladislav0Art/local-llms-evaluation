package org.jsoup.nodes;

public class GeneratedAsXmlDeclaration Returns an xml Declaration instance when the comment contains an XML declaration {

    @Test
    public void asXmlDeclaration
    Returns an
    xml Declaration
    instance when
    the comment
    contains an

    XML declaration() {
        String data = "!xml version \"1.0\" encoding=\"UTF-8\"";
        Comment comment = new Comment(data);
        XmlDeclaration decl = comment.asXmlDeclaration();
        assertNotNull(decl);
    }

}