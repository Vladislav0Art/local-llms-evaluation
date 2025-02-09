package org.jsoup.safety;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedBasicReturnsBasicTest {

    @Test
    public void basicReturnsBasicTest() {
        Safelist safelist = Safelist.basic();
        assertTrue(safelist instanceof Safelist);
    }

}