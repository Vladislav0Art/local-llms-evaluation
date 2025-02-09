package org.jsoup.safety;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedBasicRemoveProtocolsNotEnforcedAttributeTest {

    @Test
    public void basicRemoveProtocolsNotEnforcedAttributeTest() {
        Safelist safelist = Safelist.basic().removeProtocols("script", "style", new String[]{"http://example.com"});
        assertFalse(((Map<String, String>) safelist.getEnforcedAttributes("script")).containsKey("style"));
    }

}