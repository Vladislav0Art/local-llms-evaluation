package org.jsoup.safety;

import org.junit.Test;
import org.jsoup.helper.Validate;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

public class GeneratedTestRemoveTags {

    @Test
    public void testRemoveTags() {
        Safelist safelist = Safelist.relativelySafe();
        assertTrue(safelist.addTags("a", "b", "c"));
        assertFalse(safelist.removeTags("d", "e", "f"));
    }

}