package org.jsoup.safety;

import org.jsoup.safety.Safelist;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

import java.util.HashSet;
import java.util.Set;

public class GeneratedNone_SafelistEmpty {

    @Test
    public void none_SafelistEmpty() {
        Safelist safelist = Safelist.none();
        assertTrue(safelist.isSafeTag("tag"));
        assertTrue(safelist.getEnforcedAttributes("tag").isEmpty());
    }

}