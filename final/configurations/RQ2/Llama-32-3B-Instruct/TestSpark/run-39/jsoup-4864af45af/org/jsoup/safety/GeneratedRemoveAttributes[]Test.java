package org.jsoup.safety;

import org.junit.Test;

import static org.junit.Assert.*;

import org.jsoup.Safelist;
import org.jsoup.nodes.Attribute;
import org.jsoup.nodes.Element;

public class GeneratedRemoveAttributes[]

Test {

    @Test
    public void removeAttributes[] Test() {
        Safelist safelist = Safelist.removeAttributes("img", "alt");
        assertFalse(safelist.isSafeAttribute("img", null, new Attribute()));
        assertTrue(safelist.isSafeTag("img"));
    }

}