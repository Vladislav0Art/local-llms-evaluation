package org.jsoup.safety;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedBasicWithImagesTest {

    @Test
    public void basicWithImagesTest() {
        Safelist list = Safelist.basicWithImages();
        assertNotNull(list);
        assertTrue(list.getProtocols().isEmpty());
        assertTrue(list.getEnforcedAttributes().isEmpty());
        assertTrue(list.getProtocols().isEmpty());
    }

}