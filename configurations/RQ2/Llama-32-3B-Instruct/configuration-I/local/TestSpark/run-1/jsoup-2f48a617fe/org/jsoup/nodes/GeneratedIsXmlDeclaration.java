package org.jsoup.nodes;

public class GeneratedIsXmlDeclaration {

    @Test
    public void isXmlDeclaration() {
        String data = "<?xml version='1.0' encoding='UTF-8'?>";
        Comment comment = new Comment(data);
        assertTrue(comment.isXmlDeclaration());
    }

}