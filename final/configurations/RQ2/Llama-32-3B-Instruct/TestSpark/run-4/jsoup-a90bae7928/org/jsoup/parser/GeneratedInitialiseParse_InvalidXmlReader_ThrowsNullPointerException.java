package org.jsoup.parser;

public class GeneratedInitialiseParse_InvalidXmlReader_ThrowsNullPointerException {

    @Test
    public void initialiseParse_InvalidXmlReader_ThrowsNullPointerException() {
        XmlTreeBuilder builder = new XmlTreeBuilder();
        ParseSettings settings = builder.defaultSettings();
        try {
            builder.initialiseParse(new StringReader("<invalid>"), null, null);
            fail("Expected NullPointerException");
        } catch (NullPointerException e) {
            // Expected
        }
    }

}