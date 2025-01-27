package org.jsoup.safety;

import org.jsoup.helper.Validate;
import org.junit.Test;

import static org.junit.Assert.*;
import static org.mockito.Mockito.when;

public class GeneratedIsSafeAttribute_ReturnsFalseWhenAttributeIsNotSafe {

    @Test
    public void isSafeAttribute_ReturnsFalseWhenAttributeIsNotSafe() {
        Safelist safelist = Safelist.none();
        assertFalse(safelist.isSafeAttribute(null, null, new Attribute()));
    }

}