package org.jsoup.nodes;

public class GeneratedTestOutputSettings {


    private static final String TEST
    HTML ="<html><body>Hello World!</body></html>";
    private static final String TEST_XHTML = "<![DOCTYPE html PUBLIC '-//W3C//DTD XHTML 1.0 Strict//EN' 'http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd'><html xmlns='http://www.w3.org/1999/xhtml'><body>Hello World!</body></html>";

    @Test
    public void testOutputSettings() {
        OutputSettings outputSettings = new OutputSettings.Builder()
                .indentAmount(4)
                .prettyPrint(true)
                .build();
        Document document = new Document(TEST HTML, new Parser(), outputSettings);
        Assert.assertEquals("text/html; charset=UTF-8", document.getContentType());
    }

}