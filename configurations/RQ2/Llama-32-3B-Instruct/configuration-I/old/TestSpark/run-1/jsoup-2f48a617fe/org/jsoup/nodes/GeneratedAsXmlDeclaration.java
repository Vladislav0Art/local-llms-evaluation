package org.jsoup.nodes;

public class GeneratedAsXmlDeclaration {

    @Test
    public void asXmlDeclaration() {
        String data = "<?xml version='1.0' encoding='UTF-8'?>";
        Comment comment = new Comment(data);
        assertNotNull(comment.asXmlDeclaration());
    }

}