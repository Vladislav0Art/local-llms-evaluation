package org.jsoup.safety;

import org.junit.Test;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;
import static org.mockito.Mockito.when;

public class GeneratedNone {

    @Test
    public void none() {
        boolean isSafeTag = Safelist.none().isSafeTag("img");
        assertTrue(isSafeTag);
    }
}

}