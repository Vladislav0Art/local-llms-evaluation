package org.jsoup.safety;

public class GeneratedTestAttributesGetIgnoreCase {


    private boolean preserveRelativeLinks = false;

    public void setPreserveRelativeLinks(boolean preserveRelativeLinks) {
        this.preserveRelativeLinks = preserveRelativeLinks;
    }

    public boolean isPreserveRelativeLinks() {
        return preserveRelativeLinks;
    }
}

// Tags.java
public class Tags {

    private static final String All = "all";

    public static String valueOf(String tagName) {
        return All.equals(tagName) ? All : tagName;
    }
}

// Element.java

public class Element {

    public String absUrl(String key);
}

// Attribute.java

public class Attribute {

    public String getKey();

    public String getValue();

    public void setValue(String value);
}

// Attributes.java

public class Attributes {

    private static final int ALL = -1;

    public static Attributes fromAttributes(Attribute[] attributes) {
        // implementation
        return new Attributes();
    }

    public boolean hasKeyIgnoreCase(String key) {
        // implementation
        return false;
    }

    public String getIgnoreCase(String key) {
        // implementation
        return "";
    }
}

// ElementTest.java

public class ElementTest {

    @Test
    public void testAttributesGetIgnoreCase() {
        Attribute[] attributes = new Attribute[]{new Attribute()};
        Attributes attributesInstance = Attributes.fromAttributes(attributes);
        String value = attributesInstance.getIgnoreCase("key");
        assertEquals("", value);
    }
}

}