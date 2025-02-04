package org.jsoup.nodes;

public class GeneratedTestParser {

    @Test
    public void testParser() {
        Document document = new Document();
        Parser parser = new Parser();
        document.parser(parser);
        Assert.assertEquals(parser, document.parser());
    }

}