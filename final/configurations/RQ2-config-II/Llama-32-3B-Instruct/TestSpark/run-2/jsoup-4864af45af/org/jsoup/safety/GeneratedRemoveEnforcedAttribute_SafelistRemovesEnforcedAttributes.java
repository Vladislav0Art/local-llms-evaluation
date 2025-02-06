package org.jsoup.safety;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.mockito.Mockito;

import static org.junit.Assert.*;
import static org.mockito.Mockito.when;

@RunWith(JUnit4.class)
public class GeneratedRemoveEnforcedAttribute_SafelistRemovesEnforcedAttributes {

    @Test
    public void removeEnforcedAttribute_SafelistRemovesEnforcedAttributes() {
        Safelist safelist = Safelist.none();
        String tag = "img";
        String attribute = "alt";
        Safelist safelistWithEnforcedAttribute = Safelist.addEnforcedAttribute(tag, attribute, "image.jpg");
        assertEquals(1, ((Attributes) safelistWithEnforcedAttribute.getEnforcedAttributes(tag)).size());
        Safelist safelistWithoutEnforcedAttribute = Safelist.removeEnforcedAttribute(tag, attribute);
        assertEquals(0, ((Attributes) safelistWithoutEnforcedAttribute.getEnforcedAttributes(tag)).size());
    }

}