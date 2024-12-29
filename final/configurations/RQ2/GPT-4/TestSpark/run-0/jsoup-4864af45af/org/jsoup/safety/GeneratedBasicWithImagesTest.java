package org.jsoup.safety;

import static org.junit.Assert.*;

import org.jsoup.safety.Safelist;
import org.junit.Test;
import org.jsoup.nodes.Attributes;

public class GeneratedBasicWithImagesTest {

    //Testing null variables during instantiation

    @Test
    public void basicWithImagesTest() {
        Safelist safelist = Safelist.basicWithImages();
        assertNotNull(safelist);
    }

}