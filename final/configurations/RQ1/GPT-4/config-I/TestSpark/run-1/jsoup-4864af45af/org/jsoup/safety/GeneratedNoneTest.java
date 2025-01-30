package org.jsoup.safety;

import org.jsoup.nodes.Attributes;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.jsoup.safety.Safelist;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedNoneTest {

    @Test
    public void noneTest() {
        Safelist none = Safelist.none();
        assertTrue(none.isSafeTag("p"));
        assertTrue(none.isSafeTag("br"));
        assertFalse(none.isSafeTag("a"));
    }

}