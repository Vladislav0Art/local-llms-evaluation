package org.jsoup.safety;

import org.junit.Test;

import static org.junit.Assert.*;

import org.jsoup.nodes.Attribute;
import org.jsoup.nodes.Attributes;
import org.jsoup.nodes.Element;

public class GeneratedBasicWithImages_SafelistCreation {

    @Test
    public void basicWithImages_SafelistCreation() {
        Safelist safelist = Safelist.basicWithImages();
        assertNotNull(safelist);
    }

}