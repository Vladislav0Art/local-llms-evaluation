package org.jsoup.safety;

public class GeneratedTestNoEnforcedAttribute {

    private static final Map<String, AttributeValue> attributes = new HashMap<>();

    static {
        attributes.put("tag", new AttributeValue("<div id='myTag'></div>"));
        attributes.put("attr1", new AttributeValue("value1"));
        attributes.put("attr2", new AttributeValue("#anchor"));
        attributes.put("attr3", new AttributeValue("v1"));
    }

    public static String getEnforcedAttribute(String tagName, Element el, Attribute attr) {
        TagName tag = TagName.valueOf(tagName);
        if (enforcedAttributes.containsKey(tag)) {
            Map<AttributeKey, AttributeValue> keyVals = enforcedAttributes.get(tag);
            return keyVals.entrySet().stream()
                    .filter(entry -> entry.getKey().toString().equals(attr.getKey()))
                    .map(Map.Entry::getValue)
                    .findFirst()
                    .orElse(null);
        }
    }

    public static boolean isValidAnchor(String value) {
        if (value.startsWith("#") && !value.matches(".*\\s.*")) {
            return true;
        }
        return false;
    }

    @Test
    public void testNoEnforcedAttribute() {
        String value = getEnforcedAttribute("tag", Element.el, AttributeValue.string());
        assert value == null;
    }

}