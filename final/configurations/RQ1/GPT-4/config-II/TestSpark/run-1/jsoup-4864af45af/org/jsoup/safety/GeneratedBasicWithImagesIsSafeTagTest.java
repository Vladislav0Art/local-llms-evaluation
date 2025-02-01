package org.jsoup.safety;

import org.jsoup.nodes.Attribute;
import org.jsoup.nodes.Element;
import org.jsoup.safety.Safelist;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class GeneratedBasicWithImagesIsSafeTagTest {

    @Test
    public void basicWithImagesIsSafeTagTest() {
        Safelist safelist = Safelist.basicWithImages();
        String tag = "img";
        assertTrue(safelist.isSafeTag(tag));
    }

}