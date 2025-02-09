package org.jsoup.safety;

import org.jsoup.nodes.Attribute;
import org.jsoup.nodes.Element;
import org.jsoup.safety.Safelist;
import org.junit.Test;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

public class GeneratedBasicWithImagesTest {

    @Test
    public void basicWithImagesTest() {
        assertNotNull(Safelist.basicWithImages());
    }

}