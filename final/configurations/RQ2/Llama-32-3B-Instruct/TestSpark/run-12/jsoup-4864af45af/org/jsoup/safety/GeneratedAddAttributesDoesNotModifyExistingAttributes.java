package org.jsoup.safety;

import org.jsoup.helper.Validate;
import org.junit.Test;

import static org.junit.Assert.*;
import static org.mockito.Mockito.when;

public class GeneratedAddAttributesDoesNotModifyExistingAttributes {

    @Test
    public void addAttributesDoesNotModifyExistingAttributes() {
        Safelist safelist = Safelist.simpleText();
        Safelist safelistWithAttributes = safelist.addAttributes("img", "src");
        assertEquals(1, ((Attributes) safelist.getEnforcedAttributes("img")).size());
    }

}