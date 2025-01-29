package org.jsoup.safety;

import org.junit.Test;
import org.jsoup.helper.Validate;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

public class GeneratedTestBasicWithImages {

    @Test
    public void testBasicWithImages() {
        Safelist safelist = Safelist.basicWithImages();
        assertTrue(safelist.isSafeTag("a"));
        assertTrue(safelist.isSafeAttribute("href", "https://www.example.com"));
        assertTrue(safelist.getEnforcedAttributes("img") != null);
    }

}