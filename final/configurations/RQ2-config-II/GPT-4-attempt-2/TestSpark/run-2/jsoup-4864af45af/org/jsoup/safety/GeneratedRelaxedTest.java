package org.jsoup.safety;

import org.jsoup.nodes.Attribute;
import org.jsoup.nodes.Attributes;
import org.jsoup.nodes.Element;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedRelaxedTest {

    @Test
    public void relaxedTest() {
        Safelist safelist = Safelist.relaxed();
        assertTrue(safelist.isSafeTag("div"));
        assertTrue(safelist.isSafeTag("img"));
        assertTrue(safelist.isSafeTag("iframe"));
    }

}