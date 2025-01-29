package org.jsoup.parser;

public class GeneratedTest_parseFragment_SingleToken {

    private Document document;
    private XmlTreeBuilder xmlTreeBuilder;

    @Test
    public void test_parseFragment_SingleToken() {
        // Arrange
        String inputFragment = "<a>Hello</a>";
        String baseUri = "http://example.com";
        Parser parser = mock(Parser.class);
        List<Node> expectedNodes = new ArrayList<>();

        // Act
        xmlTreeBuilder.parseFragment(inputFragment, baseUri, parser);

        // Assert
        verify(expectedNodes);
    }

}