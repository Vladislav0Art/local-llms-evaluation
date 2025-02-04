package org.jsoup.nodes;

public class GeneratedTest {


    private static final String TEST
    HTML ="<html><body>Hello World!</body></html>";
    private static final String TEST_XHTML = "<![DOCTYPE html PUBLIC '-//W3C//DTD XHTML 1.0 Strict//EN' 'http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd'><html xmlns='http://www.w3.org/1999/xhtml'><body>Hello World!</body></html>";

    @Test
    public void testDocument() {
        Document document = new Document(TEST HTML);
        Assert.assertEquals("text/html", document.getContentType());
    }

    @Test
    public void testXHTMLDocument() {
        Document document = new Document(TEST_XHTML);
        Assert.assertEquals("application/xhtml+xml", document.getContentType());
    }

    @Test
    public void testParser() {
        Parser parser = new Parser();
        Document document = new Document(TEST HTML, parser);
        Assert.assertTrue(document instanceof ParserTestedDocument);
    }

    @Test
    public void testOutputSettings() {
        OutputSettings outputSettings = new OutputSettings.Builder()
                .indentAmount(4)
                .prettyPrint(true)
                .build();
        Document document = new Document(TEST HTML, new Parser(), outputSettings);
        Assert.assertEquals("text/html; charset=UTF-8", document.getContentType());
    }

    @Test
    public void testQuirksMode() {
        Document document = new Document(TEST HTML, new Parser(), QuirksMode.noQuirks);
        Assert.assertFalse(document.isInQuirksMode());
    }
}

class ParserTestedDocument extends Document {
    private final Parser parser;
    private final String html;

    public ParserTestedDocument(String html, Parser parser) {
        super(html);
        this.parser = parser;
    }

    @Override
    public boolean isInQuirksMode() {
        return false;
    }

}