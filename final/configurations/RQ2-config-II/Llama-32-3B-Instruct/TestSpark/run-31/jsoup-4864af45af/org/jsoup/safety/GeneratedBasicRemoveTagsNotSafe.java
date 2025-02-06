package org.jsoup.safety;

import org.junit.Test;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;

public class GeneratedBasicRemoveTagsNotSafe {

    @Test
    public void basicRemoveTagsNotSafe() {
        Safelist safelist = Safelist.basic();
        safelist.removeTags("img");
        assertFalse(safelist.isSafeTag("img"));
    }

}