package org.jsoup.safety;

import org.junit.Test;

import static org.junit.Assert.*;

import org.jsoup.safety.Safelist;

import java.util.Set;

public class GeneratedTestRemoveProtocols {

    @Test
    public void testRemoveProtocols() {
        Safelist safelist = Safelist.removeProtocols("img", "alt");
        Set<String> protocols = safelist.getEnforcedAttributes("img");
        assertTrue(protocols.contains("x-http"));
        assertTrue(protocols.contains("data"));
        assertFalse(safelist.isSafeAttribute("script", "", ""));
    }

}