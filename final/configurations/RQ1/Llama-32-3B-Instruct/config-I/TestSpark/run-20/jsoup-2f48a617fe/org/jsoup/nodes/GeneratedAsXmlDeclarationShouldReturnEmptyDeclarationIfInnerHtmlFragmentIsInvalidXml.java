package org.jsoup.nodes;

public class GeneratedAsXmlDeclarationShouldReturnEmptyDeclarationIfInnerHtmlFragmentIsInvalidXml {

    @Test
    public void asXmlDeclarationShouldReturnEmptyDeclarationIfInnerHtmlFragmentIsInvalidXml() throws IOException, ParseSettings {
        Document doc = Parser.htmlParser().settings(ParseSettings.preserveCase).parseInput("< invalid xml fragment >", null);
        Comment comment = new Comment("<!-- !xml declaration -->");
        XmlDeclaration xmlDeclaration = comment.asXmlDeclaration();
        assertNotNull(xmlDeclaration);
    }

}