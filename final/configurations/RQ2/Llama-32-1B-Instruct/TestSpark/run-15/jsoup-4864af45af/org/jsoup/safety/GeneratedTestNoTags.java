package org.jsoup.safety;

import org.junit.Test;
import org.jsoup.helper.Validate;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

public class GeneratedTestNoTags {

    @Test
    public void testNoTags() {
        Safelist safelist = Safelist.none();
        assertFalse(safelist.addTags("a", "b", "c"));
    }

}