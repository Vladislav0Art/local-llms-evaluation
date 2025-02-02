package org.jsoup.safety;

import org.junit.Test;

public class GeneratedTestIsSafeAttributeWithProtocols {

    @Test
    public void testIsSafeAttributeWithProtocols() {
        Element el = new Element("div", "Hello World");

        if (TestConfig.isSafeAttribute("tagName", el, new AttributeValue("#test")) || TestConfig.isSafeAttribute("all", el, new AttributeValue("#test"))) {
            System.out.println("Tag name is safe to use with the attribute");
        } else {
            System.out.println("Tag name is not safe to use with the attribute");
        }

        if (!TestConfig.isSafeAttribute("all", el, TestConfig.getEnforcedAttributes("tagName").getValue("href"))) {
            System.out.println("All tag is safe to use with the attribute");
        } else {
            System.out.println("All tag is not safe to use with the attribute");
        }
    }

}