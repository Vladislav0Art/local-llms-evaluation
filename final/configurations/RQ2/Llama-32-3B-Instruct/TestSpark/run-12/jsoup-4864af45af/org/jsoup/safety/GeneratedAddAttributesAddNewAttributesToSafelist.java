package org.jsoup.safety;

import org.jsoup.helper.Validate;
import org.junit.Test;

import static org.junit.Assert.*;
import static org.mockito.Mockito.when;

public class GeneratedAddAttributesAddNewAttributesToSafelist {

    @Test
    public void addAttributesAddNewAttributesToSafelist() {
        Safelist safelist = Safelist.none();
        Safelist safelistWithAttributes = safelist.addAttributes("a", "href");
        assertNotNull(safelistWithAttributes);
        assertEquals(1, ((Attributes) safelistWithAttributes.getEnforcedAttributes("a")).size());
    }

}