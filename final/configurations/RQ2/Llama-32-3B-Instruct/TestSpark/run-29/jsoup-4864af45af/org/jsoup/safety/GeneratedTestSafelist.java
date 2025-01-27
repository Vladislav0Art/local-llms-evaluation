package org.jsoup.safety;

public class GeneratedTestSafelist {

    private java.util.HashMap<String, java.util.List<String>> enforcedAttributes = new java.util.HashMap<>();
    private java.util.List<Rule> rules;

    public void addProtocols(String tag, String attr, String value) {
        if (!enforcedAttributes.containsKey(tag)) {
            enforcedAttributes.put(tag, new java.util.ArrayList<>());
        }
        enforcedAttributes.get(tag).add(attr);
        rules = new java.util.ArrayList<>();
        rules.add(new Rule() {
            @Override
            public boolean apply(Element element) {
                return element.hasAttr(attr) && element.attr(attr).equals(value);
            }
        });
    }

    public void removeProtocols(String tag, String attr, java.util.List<String> values) {
        if (!enforcedAttributes.containsKey(tag)) {
            enforcedAttributes.put(tag, new java.util.ArrayList<>());
        }
        enforcedAttributes.get(tag).removeIf(a -> a.equals(attr) && !values.contains(value));
        rules = new java.util.ArrayList<>();
    }

    public boolean getEnforcedAttributes(String tag).

    containsKey(ATTR_TEXT) {
        return enforcedAttributes.containsKey(tag);
    }

    public boolean isSafeTag(String tag) {
        if (!enforcedAttributes.containsKey(tag)) {
            return true;
        }
        for (Rule rule : rules) {
            if (rule.apply(null)) {
                return false;
            }
        }
        return true;
    }

    public boolean isSafeAttribute(String attr, String value, Attribute a) {
        if (!enforcedAttributes.containsKey(attr)) {
            return true;
        }
        for (Rule rule : rules) {
            if (rule.apply(null)) {
                return false;
            }
        }
        return true;
    }
}

public class GeneratedTest {

    @Before
    public void setup() throws Exception {
        Document document = new Document().select("html").append(new Element("body"));
        Safelist safelist = new Safelist();
        safelist.addProtocols("img", "src", "https://example.com");
        safelist.removeProtocols("img", "src", Arrays.asList("https://example.net"));

        assertTrue(safelist.isSafeTag("img"));
        assertFalse(safelist.getEnforcedAttributes("img").containsKey(Safelist.ATTR_SRC));
    }

    @Test
    public void testSafelist() {
        Safelist safelist = new Safelist();
        safelist.addProtocols("img", "src", "https://example.com");

        assertTrue(safelist.isSafeAttribute("a", null, new Attribute(Safelist.ATTR_SRC, "http://example.com")));
    }

}