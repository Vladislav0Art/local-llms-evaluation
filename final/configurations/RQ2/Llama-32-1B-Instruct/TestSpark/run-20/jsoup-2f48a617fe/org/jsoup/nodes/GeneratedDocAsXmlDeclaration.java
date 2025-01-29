package org.jsoup.nodes;

public class GeneratedDocAsXmlDeclaration {

    @Test
    public void docAsXmlDeclaration() {
        Tag tag = new Tag("test");
        String xmlDeclaration = docAsXmlDeclaration(tag, "<!DOCTYPE html><html></html>");
        System.out.println(xmlDeclaration);
    }
}

}