package org.jsoup.safety;

import org.jsoup.nodes.Attribute;
import org.junit.Test;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.HashSet;

public class GeneratedAddAttributes_addsAttributesForTag {

    @Test
    public void addAttributes_addsAttributesForTag() {
        Safelist safelist = Safelist.simpleText().addAttributes("a", "href", "http://example.com");
        assertNotNull(safelist);
        assertEquals(1, ((HashMap<String, String>) safelist.getEnforcedAttributes("a")).size());
    }

}