package org.jsoup.nodes;

public class GeneratedIsXmlDeclaration {

    @Test
    public void isXmlDeclaration() {
        String xmlDeclaration = "<!DOCTYPE html><html></html>";
        Comment comment = new Comment("<!DOCTYPE html><html></html>");
        assert isXmlDeclaration(xmlDeclaration);
    }

}