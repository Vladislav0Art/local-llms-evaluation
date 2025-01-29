package org.jsoup.safety;

import org.junit.Test;
import org.jsoup.helper.Validate;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

public class GeneratedTestAddTagsWithoutAttribute {

    @Test
    public void testAddTagsWithoutAttribute() {
        Safelist safelist = Safelist.relativelySafe();
        assertTrue(safelist.removeAttributes("tag"));
        assertFalse(safelist.removeAttributes(null));
    }

}