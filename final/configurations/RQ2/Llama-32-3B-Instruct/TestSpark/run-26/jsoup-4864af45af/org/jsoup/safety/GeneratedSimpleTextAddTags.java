package org.jsoup.safety;

import org.junit.Test;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;
import static org.mockito.Mockito.when;

public class GeneratedSimpleTextAddTags {

    @Test
    public void simpleTextAddTags() {
        String[] tags = {"a", "b"};
        Safelist safelist = Safelist.simpleText().addTags(tags);
        boolean isSafeTag = safelist.isSafeTag("a");
        assertTrue(isSafeTag);
    }

}