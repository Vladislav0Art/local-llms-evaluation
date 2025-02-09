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
public class GeneratedAddEnforcedAttribute_SafelistAddEnforcedAttributesShouldBeAllowed {

    @BeforeClass
    public static void setup() {
        // Initialize mocks here if needed
    }

    @Test
    public void addEnforcedAttribute_SafelistAddEnforcedAttributesShouldBeAllowed() {
        Safelist safelist = Safelist.none();
        safelist.addEnforcedAttribute("tag", "attribute", "value");
        assertTrue(safelist.getEnforcedAttributes("tag").containsKey("attribute"));
    }

}