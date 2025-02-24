package org.jsoup.safety;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.jsoup.nodes.Attributes;
import org.jsoup.nodes.Element;
import org.jsoup.parser.Tag;
import org.junit.Test;

public class GeneratedBasicTest {

    private Safelist safelist;

    @Test
    public void basicTest() {
        safelist = Safelist.basic();
        assertTrue(safelist.isSafeTag(Tag.valueOf("a").getName()));
    }

}