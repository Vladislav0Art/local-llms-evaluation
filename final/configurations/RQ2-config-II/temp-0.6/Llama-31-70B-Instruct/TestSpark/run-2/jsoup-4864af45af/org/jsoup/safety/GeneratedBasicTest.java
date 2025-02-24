package org.jsoup.safety;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedBasicTest {

    @Test
    public void basicTest() {
        Safelist list = Safelist.basic();
        assertNotNull(list);
        assertTrue(list.getProtocols().isEmpty());
        assertTrue(list.getEnforcedAttributes().isEmpty());
        assertTrue(list.getProtocols().isEmpty());
    }

}