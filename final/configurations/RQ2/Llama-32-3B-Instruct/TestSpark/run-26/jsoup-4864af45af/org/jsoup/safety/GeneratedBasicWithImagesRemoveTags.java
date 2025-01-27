package org.jsoup.safety;

import org.junit.Test;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;
import static org.mockito.Mockito.when;

public class GeneratedBasicWithImagesRemoveTags {

    @Test
    public void basicWithImagesRemoveTags() {
        String[] tags = {"img", "a"};
        Safelist safelist = Safelist.basicWithImages().removeTags(tags);
        boolean isSafeTag = safelist.isSafeTag("b");
        assertFalse(isSafeTag);
    }
}

}