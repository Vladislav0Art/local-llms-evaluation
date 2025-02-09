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
public class GeneratedAddAttributes_SafelistAddAttributesShouldBeAllowed {

    @BeforeClass
    public static void setup() {
        // Initialize mocks here if needed
    }

    @Test
    public void addAttributes_SafelistAddAttributesShouldBeAllowed() {
        Safelist safelist = Safelist.simpleText();
        safelist.addAttributes("img", "src", "https://example.com");
        assertTrue(safelist.getEnforcedAttributes("img").containsKey("src"));
    }

}