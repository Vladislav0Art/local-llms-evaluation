package org.jsoup.safety;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Set;
import java.util.HashSet;

public class GeneratedPreserveRelativeLinks_PreserveLinkPreservesLinkValueTest {

    @Test
    public void preserveRelativeLinks_PreserveLinkPreservesLinkValueTest() {
        Safelist safelist = Safelist.relaxed();
        Set<String> expectedProtocols = new HashSet<>();
        expectedProtocols.add("http");
        Safelist newSafelist = safelist.addProtocols("img", "href", expectedProtocols);
        assertEquals("http://example.com", (String) newSafelist.getEnforcedAttributes("img").get("href"));
    }

}