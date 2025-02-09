package org.jsoup.safety;

import org.junit.Test;

import static org.junit.Assert.*;

import org.jsoup.Safelist;
import org.jsoup.nodes.Attribute;
import org.jsoup.nodes.Element;

public class GeneratedAddAttributes[]

Test {

    @Test
    public void addAttributes[] Test() {
        Safelist safelist = Safelist.addAttributes("img", "alt", "image.jpg");
        assertTrue(safelist.isSafeAttribute("img", null, new Attribute()));
        assertFalse(safelist.isSafeTag("img"));
    }

}