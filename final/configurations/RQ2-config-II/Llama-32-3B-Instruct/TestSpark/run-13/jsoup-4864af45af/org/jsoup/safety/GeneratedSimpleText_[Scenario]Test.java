package org.jsoup.safety;

import org.junit.Test;

import static org.junit.Assert.*;

import org.jsoup.Safelist;

public class GeneratedSimpleText_[Scenario]

Test {

    @Test
    public void simpleText_[ Scenario]Test() {
        Safelist safelist = Safelist.simpleText();
        assertTrue(safelist.isSafeAttribute("a", null, new Attribute("href", "https://www.example.com")));
        assertFalse(safelist.isSafeAttribute("img", null, new Attribute("src", "")));
    }

}