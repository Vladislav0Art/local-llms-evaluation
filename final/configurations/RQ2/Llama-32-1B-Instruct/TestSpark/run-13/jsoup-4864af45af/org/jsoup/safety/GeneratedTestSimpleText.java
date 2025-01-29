package org.jsoup.safety;

import org.junit.Test;

import static org.junit.Assert.*;

import org.jsoup.safety.Safelist;

import java.util.Set;

public class GeneratedTestSimpleText {

    @Test
    public void testSimpleText() {
        Safelist safelist = Safelist.simpleText();
        assertTrue(safelist.isSafeTag("p"));
        assertTrue(safelist.isSafeAttribute("a", "href", "/"));
    }

}