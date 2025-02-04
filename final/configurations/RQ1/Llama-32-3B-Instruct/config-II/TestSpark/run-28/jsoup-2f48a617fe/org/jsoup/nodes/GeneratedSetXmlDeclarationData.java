package org.jsoup.nodes;

public class GeneratedSetXmlDeclarationData {

    @Test
    public void setXmlDeclarationData() {
        Comment comment = new Comment("test");
        comment.setData("!xml version \"1.0\" encoding=\"UTF-8\"");
        assertTrue(comment.isXmlDeclarationData(comment.getData()));
    }

}