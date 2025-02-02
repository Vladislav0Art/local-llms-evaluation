package org.jsoup.safety;

import org.junit.Test;

public class GeneratedTestIsSafeAttributeWithEnforcedAttributes {

    @Test
    public void testIsSafeAttributeWithEnforcedAttributes() {
        Element el = new Element("div", "Hello World");

        if (TestConfig.getEnforcedAttributes("tagName").hasKey("href") && TestConfig.getEnforcedAttributes("tagName").getValue("href").equals("#test")) {
            System.out.println("Tag name is safe to use with the attribute");
        } else {
            System.out.println("Tag name is not safe to use with the attribute");
        }

        if (!TestConfig.isSafeAttribute("all", el, new AttributeValue("#test"))) {
            System.out.println("All tag is safe to use with the attribute");
        } else {
            System.out.println("All tag is not safe to use with the attribute");
        }
    }

}