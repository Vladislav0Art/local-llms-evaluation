package org.jsoup.nodes;

public class GeneratedTestParser {

    @Test
    public void testParser() {
        Parser parser = new Parser();
        Document document = new Document().parser(parser);
        assertNotNull(document);
    }

}