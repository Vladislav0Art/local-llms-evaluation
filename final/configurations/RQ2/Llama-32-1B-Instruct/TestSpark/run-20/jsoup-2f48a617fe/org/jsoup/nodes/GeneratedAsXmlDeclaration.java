package org.jsoup.nodes;

public class GeneratedAsXmlDeclaration {

    @Test
    public void asXmlDeclaration() {
        String xmlDeclaration = "<!DOCTYPE html><html></html>";
        Comment comment = new Comment("<!DOCTYPE html><html></html>");
        System.out.println(asXmlDeclaration(comment, xmlDeclaration));
    }

}