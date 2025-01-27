package org.jsoup.safety;

import org.junit.Test;

import static org.junit.Assert.*;

import org.jsoup.nodes.Attribute;
import org.jsoup.nodes.Element;

public class GeneratedBasicWithImages {

    @Test
    public void basicWithImages() {
        Safelist basicWithImages = Safelist.basicWithImages();
        assertTrue(basicWithImages.isSafeTag("img"));
    }

}