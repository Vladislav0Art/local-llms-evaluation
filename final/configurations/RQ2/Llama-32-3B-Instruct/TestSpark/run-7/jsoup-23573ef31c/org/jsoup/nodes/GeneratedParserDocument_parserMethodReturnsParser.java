package org.jsoup.nodes;

public class GeneratedParserDocument_parserMethodReturnsParser {

    @Test
    public void parserDocument_parserMethodReturnsParser() {
        Parser expectedParser = mock(Parser.class);
        when(expectedParser.toString()).thenReturn("parser");
        Document document = new Document("");
        assertEquals(expectedParser, document.parser());
    }

}