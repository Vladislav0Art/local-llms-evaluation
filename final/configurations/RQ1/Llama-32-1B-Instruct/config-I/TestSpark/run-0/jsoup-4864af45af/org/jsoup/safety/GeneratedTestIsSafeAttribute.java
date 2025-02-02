package org.jsoup.safety;

import org.junit.Test;

public class GeneratedTestIsSafeAttribute {

    @Test
    public void testIsSafeAttribute() {
        // Test cases for attribute being defined, no protocols defined, enforced attributes, all tags
        boolean[] expected = {true, true, true, true};

        for (int i = 0; i < expected.length; i++) {
            System.out.println("Test case " + (i + 1) + ":");
            Attribute attribute = new Attribute();
            attribute.setKey("test-key-" + i);
            attribute.setValue(i);

            String tagName = "all";
            Element element = new Element(tagName, "");
            boolean isAllowed = AttributeTest.isSafeAttribute(tagName, element, attribute);
            System.out.println("Is allowed for " + (i + 1) + ": " + (isAllowed == expected[i]));
        }
    }

}