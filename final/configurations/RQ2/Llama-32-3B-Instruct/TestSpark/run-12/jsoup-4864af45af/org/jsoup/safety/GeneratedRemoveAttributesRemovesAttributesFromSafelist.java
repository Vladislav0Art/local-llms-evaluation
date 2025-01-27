package org.jsoup.safety;

import org.jsoup.helper.Validate;
import org.junit.Test;

import static org.junit.Assert.*;
import static org.mockito.Mockito.when;

public class GeneratedRemoveAttributesRemovesAttributesFromSafelist {

    @Test
    public void removeAttributesRemovesAttributesFromSafelist() {
        Safelist safelist = Safelist.simpleText();
        Safelist safelistWithoutAttributes = safelist.removeAttributes("img", "src");
        assertNotNull(safelistWithoutAttributes);
        assertEquals(0, ((Attributes) safelistWithoutAttributes.getEnforcedAttributes("img")).size());
    }

}