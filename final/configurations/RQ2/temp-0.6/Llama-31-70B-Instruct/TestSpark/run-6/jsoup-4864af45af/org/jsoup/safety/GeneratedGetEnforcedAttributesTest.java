package org.jsoup.safety;

import static org.junit.Assert.*;

import org.junit.Test;

public class GeneratedGetEnforcedAttributesTest {

    @Test
    public void getEnforcedAttributesTest() {
        Safelist safelist = new Safelist();
        assertNotNull(safelist.getEnforcedAttributes("HTML"));
    }

}