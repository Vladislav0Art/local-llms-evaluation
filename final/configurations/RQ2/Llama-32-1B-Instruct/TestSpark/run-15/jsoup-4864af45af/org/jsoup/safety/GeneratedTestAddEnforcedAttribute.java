package org.jsoup.safety;

import org.junit.Test;
import org.jsoup.helper.Validate;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

public class GeneratedTestAddEnforcedAttribute {

    @Test
    public void testAddEnforcedAttribute() {
        Safelist safelist = Safelist.relativelySafe();
        Safelist.Safelist.EnforceEnforcedAttribute s = Safelist.addEnforcedAttribute("href", "https://www.example.com", "title");
        assertTrue(s.isSafeTag("a") && s.getEnforcedAttributes("tag").containsKey("title"));
    }

}