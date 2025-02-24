package org.jsoup.safety;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedRelaxedTest {

    @Test
    public void relaxedTest() {
        Safelist list = Safelist.relaxed();
        assertNotNull(list);
        assertTrue(list.getProtocols().isEmpty());
        assertTrue(list.getEnforcedAttributes().isEmpty());
        assertTrue(list.getProtocols().isEmpty());
    }

}