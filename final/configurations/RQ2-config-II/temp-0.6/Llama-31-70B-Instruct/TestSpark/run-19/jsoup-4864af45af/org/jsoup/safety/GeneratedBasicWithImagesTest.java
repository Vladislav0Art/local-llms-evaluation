package org.jsoup.safety;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.jsoup.nodes.Attributes;
import org.jsoup.nodes.Element;
import org.jsoup.parser.Tag;
import org.junit.Test;

public class GeneratedBasicWithImagesTest {

    private Safelist safelist;

    @Test
    public void basicWithImagesTest() {
        safelist = Safelist.basicWithImages();
        assertTrue(safelist.isSafeTag(Tag.valueOf("img").getName()));
    }

}