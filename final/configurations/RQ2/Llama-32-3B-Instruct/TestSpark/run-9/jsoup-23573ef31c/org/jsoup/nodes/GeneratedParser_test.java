package org.jsoup.nodes;

public class GeneratedParser_test {

    @Test
    public void parser_test() {
        Parser parser = mock(Parser.class);
        when(parser.parse()).thenReturn(null);
        Document document = new Document("http://example.com");
        Document document2 = document.parser(parser);
        assertNotNull(document2);
        assertEquals(parser, document2.parser());
    }

}