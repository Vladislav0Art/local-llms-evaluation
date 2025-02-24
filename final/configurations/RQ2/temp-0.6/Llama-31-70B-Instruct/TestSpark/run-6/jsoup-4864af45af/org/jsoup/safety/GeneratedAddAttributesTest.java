package org.jsoup.safety;

import static org.junit.Assert.*;

import org.junit.Test;

public class GeneratedAddAttributesTest {

    @Test
    public void addAttributesTest() {
        Safelist safelist = new Safelist();
        assertEquals(0, safelist.addAttributes("HTML", "src").size());
    }

}