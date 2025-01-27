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

public class GeneratedRemoveProtocols_RemoveProtocolFromExistingTag_ReturnsNewSafelist {

    @Test
    public void removeProtocols_RemoveProtocolFromExistingTag_ReturnsNewSafelist() {
        Safelist safelist = Safelist.relaxed();
        Safelist newSafelist = safelist.removeProtocols("img", "src");
        assertNotNull(newSafelist);
        assertTrue(newSafelist.contains("img"));
        assertEquals(0, newSafelist.getEnforcedAttributes("img").size());
    }

}