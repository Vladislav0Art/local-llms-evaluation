package org.jsoup.safety;

import org.junit.Test;

import static org.junit.Assert.*;

import org.jsoup.nodes.Attribute;
import org.jsoup.nodes.Element;

public class GeneratedBasic {

    @Test
    public void basic() {
        Safelist basic = Safelist.basic();
        assertTrue(basic.isSafeTag("p"));
        assertFalse(basic.isSafeTag("img"));
    }

}