package org.jsoup.safety;

import org.jsoup.helper.Validate;
import org.junit.Test;

import static org.junit.Assert.*;
import static org.mockito.Mockito.when;

public class GeneratedAddProtocolsAddNewProtocolsToSafelist {

    @Test
    public void addProtocolsAddNewProtocolsToSafelist() {
        Safelist safelist = Safelist.none();
        Safelist safelistWithProtocols = safelist.addProtocols("a", "href");
        assertNotNull(safelistWithProtocols);
        assertEquals(1, ((Attributes) safelistWithProtocols.getEnforcedAttributes("a")).size());
    }

}