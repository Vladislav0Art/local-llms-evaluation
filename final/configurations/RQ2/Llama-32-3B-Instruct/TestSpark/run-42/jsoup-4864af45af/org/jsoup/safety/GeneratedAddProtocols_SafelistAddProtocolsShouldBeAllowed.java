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
public class GeneratedAddProtocols_SafelistAddProtocolsShouldBeAllowed {

    @BeforeClass
    public static void setup() {
        // Initialize mocks here if needed
    }

    @Test
    public void addProtocols_SafelistAddProtocolsShouldBeAllowed() {
        Safelist safelist = Safelist.none();
        safelist.addProtocols("tag", "attribute", "https://example.com");
        assertTrue(safelist.getEnforcedAttributes("tag").containsKey("attribute"));
    }

}