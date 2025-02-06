package org.jsoup.safety;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.mockito.Mockito;

import static org.junit.Assert.*;
import static org.mockito.Mockito.when;

@RunWith(JUnit4.class)
public class GeneratedAddAttributes_SafelistAddsAttributes {

    @Test
    public void addAttributes_SafelistAddsAttributes() {
        Safelist safelist = Safelist.none();
        String tag = "img";
        String[] attributes = {"alt", "src"};
        Safelist safelistWithAttributes = Safelist.addAttributes(tag, attributes);
        assertEquals(2, ((Attributes) safelistWithAttributes.getEnforcedAttributes(tag)).size());
    }

}