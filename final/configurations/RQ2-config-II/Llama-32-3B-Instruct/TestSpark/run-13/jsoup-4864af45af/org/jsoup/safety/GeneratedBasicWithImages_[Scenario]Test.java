package org.jsoup.safety;

import org.junit.Test;

import static org.junit.Assert.*;

import org.jsoup.Safelist;

public class GeneratedBasicWithImages_[Scenario]

Test {

    @Test
    public void basicWithImages_[ Scenario]Test() {
        Safelist safelist = Safelist.basicWithImages();
        assertTrue(safelist.isSafeAttribute("img", null, new Attribute("src", "")));
        assertTrue(safelist.isSafeAttribute("a", null, new Attribute("href", "https://www.example.com")));
    }

}