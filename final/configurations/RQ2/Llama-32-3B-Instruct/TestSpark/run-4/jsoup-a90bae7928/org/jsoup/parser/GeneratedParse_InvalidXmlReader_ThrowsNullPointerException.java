package org.jsoup.parser;

public class GeneratedParse_InvalidXmlReader_ThrowsNullPointerException {

    @Test
    public void parse_InvalidXmlReader_ThrowsNullPointerException() {
        XmlTreeBuilder builder = new XmlTreeBuilder();
        ParseSettings settings = builder.defaultSettings();
        try {
            builder.parse(new StringReader("<invalid>"), settings);
            fail("Expected NullPointerException");
        } catch (NullPointerException e) {
            // Expected
        }
    }

}