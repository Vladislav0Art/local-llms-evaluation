package org.jsoup.nodes;

public class GeneratedDataAsXmlDeclaration {

    @Test
    public void dataAsXmlDeclaration() {
        String xmlDeclaration = "<!DOCTYPE html><html></html>";
        Comment comment = new Comment("<!DOCTYPE html><html></html>");
        dataAsXmlDeclaration(comment, xmlDeclaration);
    }
}

}