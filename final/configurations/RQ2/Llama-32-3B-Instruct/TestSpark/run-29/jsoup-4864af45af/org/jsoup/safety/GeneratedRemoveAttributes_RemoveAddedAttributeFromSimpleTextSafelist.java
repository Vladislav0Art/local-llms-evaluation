package org.jsoup.safety;

import org.jsoup.safety.Safelist;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

import java.util.HashSet;
import java.util.Set;

public class GeneratedRemoveAttributes_RemoveAddedAttributeFromSimpleTextSafelist {

    @Test
    public void removeAttributes_RemoveAddedAttributeFromSimpleTextSafelist() {
        Safelist safelist = Safelist.simpleText();
        safelist = safelist.addAttributes("p", "data-test", "test-attribute");
        safelist = safelist.removeAttributes("p", "data-test");
        assertTrue(safelist.getEnforcedAttributes("p").isEmpty());
    }

}