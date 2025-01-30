package org.jsoup.safety;

import org.jsoup.nodes.Attributes;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.jsoup.safety.Safelist;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedSimpleTextTest {

    @Test
    public void simpleTextTest() {
        Safelist simple = Safelist.simpleText();
        assertTrue(simple.isSafeTag("b"));
        assertFalse(simple.isSafeTag("a"));
    }

}