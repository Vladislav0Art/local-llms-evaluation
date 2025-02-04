package org.jsoup.safety;

public class GeneratedTestIsSafeAttribute {

    @Test
    public void testIsSafeAttribute() throws Exception {
        WebConfig config = new WebConfig();
        Element element = new Element("html");
        Attribute attribute = new Attribute("href", "#anchor");
        assertTrue(config.isSafeAttribute(All, element, attribute));
        assertFalse(config.isSafeAttribute("div", element, attribute));

        attribute = new Attribute("src", "https://example.com/script.js");
        assertTrue(config.isSafeAttribute(All, element, attribute));
        assertFalse(config.isSafeAttribute("div", element, attribute));
    }

}