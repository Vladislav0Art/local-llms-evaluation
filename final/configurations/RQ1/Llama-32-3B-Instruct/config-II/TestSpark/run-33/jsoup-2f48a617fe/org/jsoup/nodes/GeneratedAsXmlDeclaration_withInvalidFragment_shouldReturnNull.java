package org.jsoup.nodes;

public class GeneratedAsXmlDeclaration_withInvalidFragment_shouldReturnNull {

    private static final String EMPTY_STRING = "";
    private static final String COMMENT_CONTENT = "<!-- This is a comment -->";
    private static final String XML_DECLARATION_DATA = "!XML Declaration Data!";
    private static final String XML_DECLARATION_FRAGMENT = "<!XML Declaration Data!>";
    private static final String INVALID_XML_DECLARATION_FRAGMENT = "<InvalidFragment>";

    @Test
    public void asXmlDeclaration_withInvalidFragment_shouldReturnNull() throws Exception {
        // given
        Document document = Parser.htmlParser().settings(ParseSettings.preserveCase).parseInput(INVALID_XML_DECLARATION_FRAGMENT, baseUri());

        // when
        Comment comment = new Comment(COMMENT_CONTENT);
        XmlDeclaration xmlDeclaration = comment.asXmlDeclaration();

        // then
        assertNull(xmlDeclaration);
    }

}