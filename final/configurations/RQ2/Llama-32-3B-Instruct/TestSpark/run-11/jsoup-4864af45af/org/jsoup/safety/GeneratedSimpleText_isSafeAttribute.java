package org.jsoup.safety;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Set;

public class GeneratedSimpleText_isSafeAttribute {

    @Test
    public void simpleText_isSafeAttribute() {
        Element el = new org.jsoup.nodes.Element();
        assertEquals(true, Safelist.simpleText().isSafeAttribute("img", el, new Attribute()));
    }

}