package org.jsoup.safety;

import org.jsoup.internal.Normalizer;
import org.junit.Test;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class GeneratedAddProtocols_AddedProtocolsAreAllowed {

    @Test
    public void addProtocols_AddedProtocolsAreAllowed() {
        Safelist safelist = Safelist.addProtocols("img", "src", "https://example.com", "http://example.net");
        assertTrue(safelist.getEnforcedAttributes("img").containsKey("src"));
        assertFalse(safelist.getEnforcedAttributes("img").containsKey("removeProtocol"));
    }

}