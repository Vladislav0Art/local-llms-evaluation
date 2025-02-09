package org.jsoup.safety;

import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.mockito.Mock;
import org.mockito.Mockito;

import static org.junit.Assert.*;
import static org.mockito.Mockito.when;

@RunWith(JUnit4.class)
public class GeneratedSimpleText_SafelistShouldAllowBasicTagsAndAttributes {

    @BeforeClass
    public static void setup() {
        // Initialize mocks here if needed
    }

    @Test
    public void simpleText_SafelistShouldAllowBasicTagsAndAttributes() {
        Safelist safelist = Safelist.simpleText();
        assertTrue(safelist.isSafeTag("img"));
        assertTrue(safelist.isSafeAttribute("img", null, null));
        assertTrue(safelist.getEnforcedAttributes("img").containsKey("src"));
    }

}