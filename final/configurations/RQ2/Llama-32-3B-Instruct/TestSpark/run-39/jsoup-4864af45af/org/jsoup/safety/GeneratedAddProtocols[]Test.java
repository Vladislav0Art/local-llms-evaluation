package org.jsoup.safety;

import org.junit.Test;

import static org.junit.Assert.*;

import org.jsoup.Safelist;
import org.jsoup.nodes.Attribute;
import org.jsoup.nodes.Element;

public class GeneratedAddProtocols[]

Test {

    @Test
    public void addProtocols[] Test() {
        Safelist safelist = Safelist.addProtocols("a", "href", "http://example.com");
        assertTrue(safelist.isSafeEnforcedAttribute("a", "href"));
        assertFalse(safelist.isSafeTag("a"));
    }

}