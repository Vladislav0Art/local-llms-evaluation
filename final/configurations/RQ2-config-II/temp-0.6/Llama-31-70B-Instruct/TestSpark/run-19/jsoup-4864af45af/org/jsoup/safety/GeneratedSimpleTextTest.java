package org.jsoup.safety;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.jsoup.nodes.Attributes;
import org.jsoup.nodes.Element;
import org.jsoup.parser.Tag;
import org.junit.Test;

public class GeneratedSimpleTextTest {

    private Safelist safelist;

    @Test
    public void simpleTextTest() {
        safelist = Safelist.simpleText();
        assertTrue(safelist.isSafeTag(Tag.valueOf("p").getName()));
    }

}