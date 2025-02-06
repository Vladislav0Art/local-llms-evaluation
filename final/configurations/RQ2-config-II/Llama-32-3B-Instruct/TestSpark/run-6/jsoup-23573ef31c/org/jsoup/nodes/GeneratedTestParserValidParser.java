package org.jsoup.nodes;

public class GeneratedTestParserValidParser {

    @Test
    public void testParserValidParser() {
        Parser parser = new Parser();
        Document document = new Document("");
        document.parser(parser);
        assertNotNull(document.parser());
    }

}