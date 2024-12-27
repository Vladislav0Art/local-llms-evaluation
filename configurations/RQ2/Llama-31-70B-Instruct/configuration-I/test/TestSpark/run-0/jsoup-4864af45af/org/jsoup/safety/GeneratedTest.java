package org.jsoup.safety;

import org.jsoup.nodes.Attribute;
import org.jsoup.nodes.Element;
import org.jsoup.safety.Safelist;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class GeneratedTest {

    @Test
    public void noneTest() {
        Safelist safelist = Safelist.none();
        assertEquals(0, safelist.getTags().size());
    }

    @Test
    public void simpleTextTest() {
        Safelist safelist = Safelist.simpleText();
        assertTrue(safelist.getTags().contains("p"));
        assertTrue(safelist.getTags().contains("br"));
        assertTrue(safelist.getTags().contains("blockquote"));
        assertTrue(safelist.getTags().contains("code"));
        assertTrue(safelist.getTags().contains("b"));
        assertTrue(safelist.getTags().contains("i"));
        assertTrue(safelist.getTags().contains("em"));
        assertTrue(safelist.getTags().contains("strong"));
    }

}