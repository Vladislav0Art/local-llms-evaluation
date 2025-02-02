package org.jsoup.safety;

public class GeneratedTestIsSafeAttribute_enforcedAttributes {

    // ...
}

public class Attribute {
    private final String key;
    private final String value;

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

public class Attributes {
    // ...
}

public class All extends TagName {
    public static final String NAME = "all";
}

public class TestSafeAttributes {

    @Test
    public void testIsSafeAttribute_enforcedAttributes() {
        Element el = new Element();
        Attribute attr = new Attribute("a", "b");
        Assert.assertTrue(SafeAttributes.isSafeAttribute(All.NAME, el, attr));
    }

}