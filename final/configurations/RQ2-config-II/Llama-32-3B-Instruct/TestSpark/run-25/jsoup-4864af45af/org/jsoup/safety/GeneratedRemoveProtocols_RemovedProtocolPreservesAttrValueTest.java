package org.jsoup.safety;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Set;
import java.util.HashSet;

public class GeneratedRemoveProtocols_RemovedProtocolPreservesAttrValueTest {

    @Test
    public void removeProtocols_RemovedProtocolPreservesAttrValueTest() {
        Safelist safelist = Safelist.none();
        Set<String> expectedTags = new HashSet<>();
        expectedTags.add("img", "br");
        Safelist newSafelist = newSafelist.removeProtocols(expectedTags, "href", new HashSet<>());
        assertEquals(123L, (long) newSafelist.getEnforcedAttributes("img").get("alt"));
    }

}