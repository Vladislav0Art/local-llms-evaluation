package org.jsoup.nodes;

public class GeneratedTestParserNullParser {

    @Test
    public void testParserNullParser() {
        Parser parser = null;
        Document document = new Document("");
        try {
            document.parser(parser);
            assert false;
        } catch (NullPointerException e) {
            // expected
        }
    }

}