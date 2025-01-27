package org.jsoup.safety;

import org.junit.Test;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;
import static org.mockito.Mockito.when;

public class GeneratedBasicWithImagesRemoveAttributes {

    @Test
    public void basicWithImagesRemoveAttributes() {
        String tag = "img";
        String[] attributes = {"alt", "src"};
        Safelist safelist = Safelist.basicWithImages().removeAttributes(tag, attributes);
        Attributes enforcedAttributes = safelist.getEnforcedAttributes(tag);
        boolean isSafeAttribute = !enforcedAttributes.containsKey("alt");
        assertTrue(isSafeAttribute);
    }
}

}