package org.jsoup.safety;

import org.junit.Test;

import static org.junit.Assert.*;

import org.jsoup.nodes.Attribute;
import org.jsoup.nodes.Element;

public class GeneratedRelaxed {

    @Test
    public void relaxed() {
        Safelist relaxed = Safelist.relaxed();
        assertTrue(relaxed.isSafeTag("div"));
        assertFalse(relaxed.isSafeTag("script"));
    }

}