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
public class GeneratedRemoveEnforcedAttribute_SafelistRemoveEnforcedAttributesShouldBeAllowed {

    @BeforeClass
    public static void setup() {
        // Initialize mocks here if needed
    }

    @Test
    public void removeEnforcedAttribute_SafelistRemoveEnforcedAttributesShouldBeAllowed() {
        Safelist safelist = Safelist.none();
        safelist.removeEnforcedAttribute("tag", "attribute");
        assertFalse(safelist.getEnforcedAttributes("tag").containsKey("attribute"));
    }

}