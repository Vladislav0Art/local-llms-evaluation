package org.jsoup.safety;

import org.junit.Test;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;
import static org.mockito.Mockito.when;

public class GeneratedBasicWithImagesRemoveEnforcedAttributes {

    @Test
    public void basicWithImagesRemoveEnforcedAttributes() {
        String tag = "img";
        String attribute = "src";
        Safelist safelist = Safelist.basicWithImages().addEnforcedAttribute(tag, attribute, "image.jpg");
        safelist = safelist.removeEnforcedAttribute(tag, attribute);
        Attributes enforcedAttributes = safelist.getEnforcedAttributes(tag);
        boolean isSafeAttribute = !enforcedAttributes.containsKey(attribute);
        assertTrue(isSafeAttribute);
    }
}

}