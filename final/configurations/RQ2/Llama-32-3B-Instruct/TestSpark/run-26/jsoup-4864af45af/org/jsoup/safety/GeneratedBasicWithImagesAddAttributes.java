package org.jsoup.safety;

import org.junit.Test;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;
import static org.mockito.Mockito.when;

public class GeneratedBasicWithImagesAddAttributes {

    @Test
    public void basicWithImagesAddAttributes() {
        String tag = "img";
        String[] attributes = {"alt", "src"};
        Safelist safelist = Safelist.basicWithImages().addAttributes(tag, attributes);
        Attributes enforcedAttributes = safelist.getEnforcedAttributes(tag);
        // Assuming getEnforcedAttributes returns an object that has a method to check if a key exists
        boolean isSafeAttribute = enforcedAttributes.containsKey("alt");
        assertTrue(isSafeAttribute);
    }

}