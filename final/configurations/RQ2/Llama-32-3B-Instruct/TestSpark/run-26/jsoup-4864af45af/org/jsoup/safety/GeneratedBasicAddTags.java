package org.jsoup.safety;

import org.junit.Test;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;
import static org.mockito.Mockito.when;

public class GeneratedBasicAddTags {

    @Test
    public void basicAddTags() {
        String[] tags = {"a", "b"};
        Safelist safelist = Safelist.basic().addTags(tags);
        boolean isSafeTag = safelist.isSafeTag("a");
        assertTrue(isSafeTag);
    }

}