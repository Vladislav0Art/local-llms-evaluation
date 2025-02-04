package org.jsoup.safety;

public class GeneratedTestTestValidProtocol {

    @Test
    public void testTestValidProtocol() throws Exception {
        WebConfig config = new WebConfig();
        Element element = new Element("html");
        Attribute attribute = new Attribute("href", "https://example.com/script.js");
        assertTrue(config.testValidProtocol(element, attribute, Collections.singleton(new Protocol("#"))));
    }

}