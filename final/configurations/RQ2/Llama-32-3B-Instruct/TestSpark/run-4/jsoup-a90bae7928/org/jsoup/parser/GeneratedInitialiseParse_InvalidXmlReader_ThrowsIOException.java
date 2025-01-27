package org.jsoup.parser;

public class GeneratedInitialiseParse_InvalidXmlReader_ThrowsIOException {

    @Test
    public void initialiseParse_InvalidXmlReader_ThrowsIOException() {
        XmlTreeBuilder builder = new XmlTreeBuilder();
        ParseSettings settings = builder.defaultSettings();
        try {
            builder.initialiseParse(null, settings, null);
            fail("Expected IOException");
        } catch (IOException e) {
            // Expected
        }
    }

}