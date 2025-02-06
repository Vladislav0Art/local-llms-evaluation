package org.jsoup.safety;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.mockito.Mockito;

import static org.junit.Assert.*;
import static org.mockito.Mockito.when;

@RunWith(JUnit4.class)
public class GeneratedAddEnforcedAttribute_SafelistAddsEnforcedAttributes {

    @Test
    public void addEnforcedAttribute_SafelistAddsEnforcedAttributes() {
        Safelist safelist = Safelist.none();
        String tag = "img";
        String attribute = "alt";
        String value = "image.jpg";
        Safelist safelistWithEnforcedAttribute = Safelist.addEnforcedAttribute(tag, attribute, value);
        assertEquals(1, ((Attributes) safelistWithEnforcedAttribute.getEnforcedAttributes(tag)).size());
    }

}