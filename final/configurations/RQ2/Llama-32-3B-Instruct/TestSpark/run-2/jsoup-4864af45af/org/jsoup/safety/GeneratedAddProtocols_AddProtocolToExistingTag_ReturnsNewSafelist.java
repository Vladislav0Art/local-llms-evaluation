package org.jsoup.safety;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.HashSet;
import java.util.Set;

import org.jsoup.nodes.Attribute;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.Attributes;
import org.jsoup.helper.Validate;
import org.jsoup.internal.Normalizer;

public class GeneratedAddProtocols_AddProtocolToExistingTag_ReturnsNewSafelist {

    @Test
    public void addProtocols_AddProtocolToExistingTag_ReturnsNewSafelist() {
        Safelist safelist = Safelist.relaxed();
        Safelist newSafelist = safelist.addProtocols("img", "src", "http://example.com");
        assertNotNull(newSafelist);
        assertTrue(newSafelist.contains("img"));
        assertEquals(1, newSafelist.getEnforcedAttributes("img").size());
    }

}