package org.jsoup.safety;

import org.junit.Test;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;
import static org.mockito.Mockito.when;

public class GeneratedBasicWithImagesAddTags {

    @Test
    public void basicWithImagesAddTags() {
        String[] tags = {"img", "a"};
        Safelist safelist = Safelist.basicWithImages().addTags(tags);
        boolean isSafeTag = safelist.isSafeTag("img");
        assertTrue(isSafeTag);
    }

}