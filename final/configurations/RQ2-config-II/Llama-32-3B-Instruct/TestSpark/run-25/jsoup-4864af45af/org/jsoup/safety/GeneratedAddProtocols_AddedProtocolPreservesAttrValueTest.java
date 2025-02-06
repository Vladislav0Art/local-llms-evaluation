package org.jsoup.safety;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Set;
import java.util.HashSet;

public class GeneratedAddProtocols_AddedProtocolPreservesAttrValueTest {

    @Test
    public void addProtocols_AddedProtocolPreservesAttrValueTest() {
        Safelist safelist = Safelist.none();
        Set<String> expectedTags = new HashSet<>();
        expectedTags.add("img", "br");
        Safelist newSafelist = newSafelist.addProtocols(expectedTags, "href", "http://example.com");
        assertEquals("http://example.com", (String) newSafelist.getEnforcedAttributes("img").get("href"));
    }

}