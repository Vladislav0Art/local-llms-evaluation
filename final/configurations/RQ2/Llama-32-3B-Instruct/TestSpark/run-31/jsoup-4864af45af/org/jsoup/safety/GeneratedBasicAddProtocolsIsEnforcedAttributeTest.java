package org.jsoup.safety;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedBasicAddProtocolsIsEnforcedAttributeTest {

    @Test
    public void basicAddProtocolsIsEnforcedAttributeTest() {
        Safelist safelist = Safelist.basic().addProtocols("img", "src", new String[]{"http://example.com"});
        assertTrue(((Map<String, String>) safelist.getEnforcedAttributes("img")).containsKey("src"));
    }

}