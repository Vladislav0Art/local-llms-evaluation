package org.jsoup.safety;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedTest {

    @Test
    public void noneTest() {
        Safelist list = Safelist.none();
        assertNotNull(list);
        assertTrue(list.getProtocols().isEmpty());
        assertTrue(list.getEnforcedAttributes().isEmpty());
        assertTrue(list.getProtocols().isEmpty());
    }

    @Test
    public void simpleTextTest() {
        Safelist list = Safelist.simpleText();
        assertNotNull(list);
        assertTrue(list.getProtocols().isEmpty());
        assertTrue(list.getEnforcedAttributes().isEmpty());
        assertTrue(list.getProtocols().isEmpty());
    }

    @Test
    public void basicTest() {
        Safelist list = Safelist.basic();
        assertNotNull(list);
        assertTrue(list.getProtocols().isEmpty());
        assertTrue(list.getEnforcedAttributes().isEmpty());
        assertTrue(list.getProtocols().isEmpty());
    }

    @Test
    public void basicWithImagesTest() {
        Safelist list = Safelist.basicWithImages();
        assertNotNull(list);
        assertTrue(list.getProtocols().isEmpty());
        assertTrue(list.getEnforcedAttributes().isEmpty());
        assertTrue(list.getProtocols().isEmpty());
    }

    @Test
    public void relaxedTest() {
        Safelist list = Safelist.relaxed();
        assertNotNull(list);
        assertTrue(list.getProtocols().isEmpty());
        assertTrue(list.getEnforcedAttributes().isEmpty());
        assertTrue(list.getProtocols().isEmpty());
    }

}