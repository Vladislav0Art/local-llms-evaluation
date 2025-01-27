package org.jsoup.safety;

public class GeneratedTest {

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

    public boolean getEnforcedAttributes(String tag) {
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

    private static final String ATTR_TEXT = "text";
}

public class GeneratedTest {

    @Before
    public void setup() throws Exception {
        Document document = new Document().select("html").append(new Element("body"));
        Safelist safelist = new Safelist();
        safelist.addProtocols("img", "src", "https://example.com");
        safelist.removeProtocols("img", "src", Arrays.asList("https://example.net"));

        assertTrue(safelist.isSafeTag("img"));
        assertFalse(safelist.getEnforcedAttributes("img").containsKey(Safelist.ATTR_TEXT));
    }

    @Test
    public void none_SafelistEmpty() {
        Safelist safelist = Safelist.none();
        assertTrue(safelist.isSafeTag("tag"));
        assertTrue(safelist.getEnforcedAttributes("tag").isEmpty());
    }

    @Test
    public void basic_BasicWithImagesSafelist() {
        Safelist safelist = Safelist.basic();
        assertTrue(safelist.isSafeTag("img"));
        assertTrue(safelist.getEnforcedAttributes("img").isEmpty());
    }

    @Test
    public void addTags_SimpleTextWithAddedTagSafelist() {
        Safelist safelist = Safelist.simpleText();
        safelist = safelist.addTags("script");
        assertTrue(safelist.isSafeTag("script"));
    }

    @Test
    public void removeAttributes_RemoveAddedAttributeFromSimpleTextSafelist() {
        Safelist safelist = Safelist.simpleText();
        safelist = safelist.addAttributes("p", "data-test", "test-attribute");
        safelist = safelist.removeAttributes("p", "data-test");
        assertTrue(safelist.getEnforcedAttributes("p").isEmpty());
    }

    @Test
    public void removeEnforcedAttribute_RemoveAddedEnforcedAttributeFromBasicSafelist() {
        Safelist safelist = Safelist.basic();
        safelist = safelist.addEnforcedAttribute("form", "data-attr", "test-value");
        safelist = safelist.removeEnforcedAttribute("form", "data-attr");
        assertTrue(safelist.getEnforcedAttributes("form").isEmpty());
    }

}