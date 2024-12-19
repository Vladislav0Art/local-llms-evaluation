package org.jsoup.nodes;

public class GeneratedIsXmlDeclaration Returns true for
an XML
declaration comment {

@Test
public void isXmlDeclaration
Returns true for
an XML

declaration comment() {
    String data = "!xml version \"1.0\" encoding=\"UTF-8\"";
    Comment comment = new Comment(data);
    assertTrue(comment.isXmlDeclaration());
}

}