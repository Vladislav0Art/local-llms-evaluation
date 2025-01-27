package org.jsoup.safety;

import org.jsoup.helper.Validate;
import org.junit.Test;

import static org.junit.Assert.*;
import static org.mockito.Mockito.when;

public class GeneratedAddProtocolsDoesNotModifyExistingProtocols {

    @Test
    public void addProtocolsDoesNotModifyExistingProtocols() {
        Safelist safelist = Safelist.simpleText();
        Safelist safelistWithProtocols = safelist.addProtocols("img", "src");
        assertEquals(1, ((Attributes) safelist.getEnforcedAttributes("img")).size());
    }

}