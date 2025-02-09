package org.jsoup.safety;

import org.jsoup.nodes.Attribute;
import org.jsoup.nodes.Element;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedBasicWithImagesInitTest {

    @Test
    public void basicWithImagesInitTest() {
        Safelist safelist = Safelist.basicWithImages();
        assertNotNull(safelist);
    }

}