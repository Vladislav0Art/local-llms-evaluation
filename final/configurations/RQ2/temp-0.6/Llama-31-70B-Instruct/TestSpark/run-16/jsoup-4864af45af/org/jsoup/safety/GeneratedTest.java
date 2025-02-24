package org.jsoup.safety;

import org.jsoup.safety.Safelist;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedTest {

    @Test
    public void isSafeTagTest() {
        Safelist safelist = new Safelist();
        assertTrue(safelist.isSafeTag("p"));
        assertTrue(safelist.isSafeTag("div"));
        assertFalse(safelist.isSafeTag("script"));
        assertFalse(safelist.isSafeTag("style"));
    }

    @Test
    public void isSafeAttributeTest() {
        Safelist safelist = new Safelist();
        assertTrue(safelist.isSafeAttribute("p", null, new Attribute("class", "my-class")));
        assertFalse(safelist.isSafeAttribute("p", null, new Attribute("onclick", "alert('hi')")));
    }

}