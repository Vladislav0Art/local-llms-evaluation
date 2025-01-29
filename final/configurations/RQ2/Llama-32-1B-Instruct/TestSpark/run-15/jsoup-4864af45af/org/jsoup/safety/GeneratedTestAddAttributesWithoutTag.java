package org.jsoup.safety;

import org.junit.Test;
import org.jsoup.helper.Validate;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

public class GeneratedTestAddAttributesWithoutTag {

    @Test
    public void testAddAttributesWithoutTag() {
        Safelist safelist = Safelist.relativelySafe();
        assertTrue(safelist.addAttributes("href", "https://www.example.com", "title"));
    }

}