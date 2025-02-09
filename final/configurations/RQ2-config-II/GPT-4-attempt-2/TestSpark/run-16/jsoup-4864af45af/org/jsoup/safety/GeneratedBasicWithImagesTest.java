package org.jsoup.safety;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.jsoup.nodes.Attribute;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.Attributes;
import org.junit.Test;

public class GeneratedBasicWithImagesTest {

    @Test
    public void basicWithImagesTest() {
        Safelist safelist = Safelist.basicWithImages();
        assertTrue(safelist.isSafeTag("img"));
    }

}