package org.jsoup.safety;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedSimpleTextReturnsSimpleTextTest {

    @Test
    public void simpleTextReturnsSimpleTextTest() {
        Safelist safelist = Safelist.simpleText();
        assertTrue(safelist instanceof Safelist);
    }

}