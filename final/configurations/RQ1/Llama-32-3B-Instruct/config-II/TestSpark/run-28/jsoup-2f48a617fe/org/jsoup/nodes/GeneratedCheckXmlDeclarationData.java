package org.jsoup.nodes;

public class GeneratedCheckXmlDeclarationData {

    @Test
    public void checkXmlDeclarationData() {
        Comment comment = new Comment("!xml version \"1.0\" encoding=\"UTF-8\"");
        assertTrue(comment.isXmlDeclarationData(comment.getData()));
    }

}