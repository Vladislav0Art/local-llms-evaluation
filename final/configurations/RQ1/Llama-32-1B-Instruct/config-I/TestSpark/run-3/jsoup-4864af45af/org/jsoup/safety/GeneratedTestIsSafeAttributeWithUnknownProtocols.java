package org.jsoup.safety;

import org.junit.Test;

public class GeneratedTestIsSafeAttributeWithUnknownProtocols {

    @Test
    public void testIsSafeAttributeWithUnknownProtocols() {
        Element el = new Element("div", "Hello World");

        if (TestConfig.isSafeAttribute("tagName", el, TestConfig.getEnforcedAttributes("all").getValue("href"))) {
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

    private boolean testValidProtocol(Element el, Attribute attr, Set<Protocol> protocols) {
        String value = el.absUrl(attr.getKey());

        for (Protocol protocol : protocols) {
            if (protocol.toString().equals("#")) {
                return true;
            }

            protocol += ":";

            if (lowerCase(value).startsWith(protocol)) {
                return true;
            }
        }
        return false;
    }

}