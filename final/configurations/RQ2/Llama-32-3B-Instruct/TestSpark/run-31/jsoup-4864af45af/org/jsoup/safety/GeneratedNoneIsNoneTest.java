package org.jsoup.safety;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedNoneIsNoneTest {

    @Test
    public void noneIsNoneTest() {
        Safelist safelist = Safelist.none();
        assertTrue(safelist instanceof Safelist);
    }

}