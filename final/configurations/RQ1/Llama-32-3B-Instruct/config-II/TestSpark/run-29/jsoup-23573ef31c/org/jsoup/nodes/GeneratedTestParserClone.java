package org.jsoup.nodes;

public class GeneratedTestParserClone {

    @Test
    public void testParserClone() {
        Parser parser = new Parser();
        parser.setParseMode(Parser ParseMode.HTML);
        Document document = new Document();
        document.parser(parser.clone());
        Assert.assertEquals(ParseMode.HTML, document.parser().getParseMode());
    }

}