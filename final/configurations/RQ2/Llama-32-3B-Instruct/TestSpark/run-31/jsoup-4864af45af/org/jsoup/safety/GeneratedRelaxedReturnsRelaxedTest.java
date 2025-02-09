package org.jsoup.safety;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedRelaxedReturnsRelaxedTest {

    @Test
    public void relaxedReturnsRelaxedTest() {
        Safelist safelist = Safelist.relaxed();
        assertTrue(safelist instanceof Safelist);
    }

}