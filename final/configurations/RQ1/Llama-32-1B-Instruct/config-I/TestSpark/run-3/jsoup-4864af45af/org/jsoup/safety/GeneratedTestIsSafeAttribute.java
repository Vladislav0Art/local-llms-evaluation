package org.jsoup.safety;

import org.junit.Test;

public class GeneratedTestIsSafeAttribute {

    @Test
    public void testIsSafeAttribute() {
        Element el = new Element("div", "Hello World");
        Attribute attr = new Attribute("href", "#test");

        if (TestConfig.isSafeAttribute("tagName", el, attr)) {
            System.out.println("Tag name is safe to use with the attribute");
        } else {
            System.out.println("Tag name is not safe to use with the attribute");
        }

        if (!TestConfig.isSafeAttribute("all", el, attr)) {
            System.out.println("All tag is safe to use with the attribute");
        } else {
            System.out.println("All tag is not safe to use with the attribute");
        }
    }

}