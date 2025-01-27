package org.jsoup.safety;

import org.jsoup.helper.Validate;
import org.junit.Test;

import static org.junit.Assert.*;
import static org.mockito.Mockito.when;

public class GeneratedRemoveProtocolsRemovesProtocolsFromSafelist {

    @Test
    public void removeProtocolsRemovesProtocolsFromSafelist() {
        Safelist safelist = Safelist.simpleText();
        Safelist safelistWithoutProtocols = safelist.removeProtocols("a", "href");
        assertNotNull(safelistWithoutProtocols);
        assertEquals(0, ((Attributes) safelistWithoutProtocols.getEnforcedAttributes("a")).size());
    }

}