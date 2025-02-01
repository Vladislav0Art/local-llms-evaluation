package org.jsoup.safety;

import org.jsoup.nodes.Attribute;
import org.jsoup.nodes.Element;
import org.jsoup.safety.Safelist;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedNoneTest {

    @Test
    public void noneTest() {
        Safelist safelist = Safelist.none();
        assertFalse(safelist.isSafeTag("html"));
    }

}