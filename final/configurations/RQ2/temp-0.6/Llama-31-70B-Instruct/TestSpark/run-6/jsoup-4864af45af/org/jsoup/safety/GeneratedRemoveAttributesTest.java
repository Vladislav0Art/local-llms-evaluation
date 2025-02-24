package org.jsoup.safety;

import static org.junit.Assert.*;

import org.junit.Test;

public class GeneratedRemoveAttributesTest {

    @Test
    public void removeAttributesTest() {
        Safelist safelist = new Safelist();
        assertEquals(0, safelist.removeAttributes("HTML", "src").size());
    }

}