package org.jsoup.safety;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;

public class GeneratedTest {

    private Map<String, String> enforcedAttributes = new HashMap<>();

    public void addAttribute(String attributeKey, String value) {
        enforcedAttributes.put(attributeKey, value);
    }

    public boolean testValidProtocol(Element element, String tag, Protocol protocol) {
        if (!enforcedAttributes.containsKey("tag")) return false;
        Document doc = Jsoup.parse(element.outerHtml());
        Element myTag = doc.select(tag).first();
        if (myTag == null || !testValidProtocol(myTag, "example", protocol)) return false;
        for (Attribute attribute : enforcedAttributes.values()) {
            String value = attribute.getValue();
            Element element = doc.select(String.valueOf(attribute.getKey())).first();
            if (!element.hasAttr(attribute.getKey()) || !element.attr(attribute.getKey()).equals(value)) return false;
        }
        return true;
    }

    @Test
    public void testGetEnforcedAttribute() {
        addAttribute("tag", "example");
        addAttribute("key", "value");

        String value = getEnforcedAttribute("tag", Element.el, AttributeValue.string());
        System.out.println(value);  // Output: example

        Protocol protocol = new Protocol("https://example.com");
        boolean isValidProtocol = testValidProtocol(Element.el, "myTag", protocol);
        System.out.println(isValidProtocol);  // Output: true
    }

    public static class Attribute {
        private String key;
        private String value;

        public Attribute(String key, String value) {
            this.key = key;
            this.value = value;
        }

        public String getKey() {
            return key;
        }

        public String getValue() {
            return value;
        }
    }

    public static class ElementTag {
        public Document document;

        public ElementTag(Document document) {
            this.document = document;
        }
    }

    public static class Protocol {
        private String url;
    }

}