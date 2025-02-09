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
public class GeneratedRemoveAttributes_SafelistRemoveAttributesShouldBeAllowed {

    @BeforeClass
    public static void setup() {
        // Initialize mocks here if needed
    }

    @Test
    public void removeAttributes_SafelistRemoveAttributesShouldBeAllowed() {
        Safelist safelist = Safelist.simpleText();
        safelist.removeAttributes("img", "src");
        assertFalse(safelist.getEnforcedAttributes("img").containsKey("src"));
    }

}