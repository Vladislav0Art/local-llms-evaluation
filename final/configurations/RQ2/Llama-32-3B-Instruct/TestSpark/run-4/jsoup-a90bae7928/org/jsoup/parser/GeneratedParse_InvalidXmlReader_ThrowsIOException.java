package org.jsoup.parser;

public class GeneratedParse_InvalidXmlReader_ThrowsIOException {

    @Test
    public void parse_InvalidXmlReader_ThrowsIOException() {
        XmlTreeBuilder builder = new XmlTreeBuilder();
        ParseSettings settings = builder.defaultSettings();
        try {
            builder.parse(null, settings);
            fail("Expected IOException");
        } catch (IOException e) {
            // Expected
        }
    }

}