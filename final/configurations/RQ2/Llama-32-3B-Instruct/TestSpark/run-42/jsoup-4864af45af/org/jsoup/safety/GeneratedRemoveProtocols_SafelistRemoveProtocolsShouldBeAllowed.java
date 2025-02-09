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
public class GeneratedRemoveProtocols_SafelistRemoveProtocolsShouldBeAllowed {

    @BeforeClass
    public static void setup() {
        // Initialize mocks here if needed
    }

    @Test
    public void removeProtocols_SafelistRemoveProtocolsShouldBeAllowed() {
        Safelist safelist = Safelist.none();
        safelist.removeProtocols("tag", "attribute", "https://example.com");
        assertFalse(safelist.getEnforcedAttributes("tag").containsKey("attribute"));
    }

}