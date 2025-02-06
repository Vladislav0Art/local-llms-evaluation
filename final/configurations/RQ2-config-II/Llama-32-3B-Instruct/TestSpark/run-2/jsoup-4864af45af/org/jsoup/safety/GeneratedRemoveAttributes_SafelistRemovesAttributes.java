package org.jsoup.safety;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.mockito.Mockito;

import static org.junit.Assert.*;
import static org.mockito.Mockito.when;

@RunWith(JUnit4.class)
public class GeneratedRemoveAttributes_SafelistRemovesAttributes {

    @Test
    public void removeAttributes_SafelistRemovesAttributes() {
        Safelist safelist = Safelist.none();
        String tag = "img";
        String[] attributes = {"alt", "src"};
        Safelist safelistWithAttributes = Safelist.addAttributes(tag, attributes);
        assertEquals(2, ((Attributes) safelistWithAttributes.getEnforcedAttributes(tag)).size());
        Safelist safelistWithoutAttributes = Safelist.removeAttributes(tag, attributes);
        assertEquals(0, ((Attributes) safelistWithoutAttributes.getEnforcedAttributes(tag)).size());
    }

}