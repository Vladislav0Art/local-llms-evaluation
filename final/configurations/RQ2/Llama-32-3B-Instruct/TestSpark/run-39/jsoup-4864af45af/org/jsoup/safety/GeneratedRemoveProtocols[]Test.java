package org.jsoup.safety;

import org.junit.Test;

import static org.junit.Assert.*;

import org.jsoup.Safelist;
import org.jsoup.nodes.Attribute;
import org.jsoup.nodes.Element;

public class GeneratedRemoveProtocols[]

Test {

    @Test
    public void removeProtocols[] Test() {
        Safelist safelist = Safelist.removeProtocols("img", "src", new String[]{"http://example.com"});
        assertTrue(safelist.isSafeEnforcedAttribute("img", "src"));
        assertFalse(safelist.isSafeTag("img"));
    }

}