package org.jsoup.safety;

import org.junit.Test;
import org.jsoup.helper.Validate;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

public class GeneratedTestRemoveAttributesWithoutTag {

    @Test
    public void testRemoveAttributesWithoutTag() {
        Safelist safelist = Safelist.relativelySafe();
        assertTrue(safelist.removeAttributes("tag", "class"));
        assertFalse(safelist.removeAttributes(null));
    }

}