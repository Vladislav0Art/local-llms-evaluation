package org.jsoup.safety;

import org.jsoup.internal.Normalizer;
import org.junit.Test;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class GeneratedGetEnforcedAttributes_AttributesAreReturnedForTag {

    @Test
    public void getEnforcedAttributes_AttributesAreReturnedForTag() {
        Safelist safelist = Safelist.addTags("a").addAttributes("a", "href", "https://example.com");
        assertTrue(safelist.getEnforcedAttributes("a").containsKey("href"));
    }

}