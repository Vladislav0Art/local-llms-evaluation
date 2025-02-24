package org.jsoup.safety;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedNoneTest {

    @Test
    public void noneTest() {
        Safelist list = Safelist.none();
        assertNotNull(list);
        assertTrue(list.getProtocols().isEmpty());
        assertTrue(list.getEnforcedAttributes().isEmpty());
        assertTrue(list.getProtocols().isEmpty());
    }

}