package org.jsoup.safety;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Set;

public class GeneratedTestRelaxed_SafeTagsAreRelaxedAndImagesAllowed {

    private Safelist none;
    private Safelist simpleText;
    private Safelist basic;
    private Safelist basicWithImages;
    private Safelist relaxed;

    @Before
    public void setup() {
        none = new Safelist();
        simpleText = new Safelist(none);
        basic = new Safelist(simpleText);
        basicWithImages = new Safelist(basic);
        relaxed = new Safelist();
    }

    @Test
    public void testRelaxed_SafeTagsAreRelaxedAndImagesAllowed() {
        assertFalse(relaxed.isSafeTag("a"));
        assertTrue(relaxed.isSafeTag("img"));
        Set<String> enforcedAttributes = relaxed.getEnforcedAttributes("p");
        assertEquals("[attribute1='value1'], [attribute2='value2']", getAttributeString(enforcedAttributes));
    }

    private String getAttributeString(Set<String> attributes) {
        StringBuilder sb = new StringBuilder();
        for (String attribute : attributes) {
            sb.append(attribute).append('=');
        }
        return sb.toString().trim();
    }

}