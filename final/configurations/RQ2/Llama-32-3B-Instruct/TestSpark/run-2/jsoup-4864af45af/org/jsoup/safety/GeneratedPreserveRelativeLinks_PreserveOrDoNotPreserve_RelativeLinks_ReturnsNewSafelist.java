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

public class GeneratedPreserveRelativeLinks_PreserveOrDoNotPreserve_RelativeLinks_ReturnsNewSafelist {

    @Test
    public void preserveRelativeLinks_PreserveOrDoNotPreserve_RelativeLinks_ReturnsNewSafelist() {
        Safelist safelist = Safelist.relaxed();
        Safelist newSafelist = safelist.preserveRelativeLinks(true);
        assertNotNull(newSafelist);
        assertTrue(newSafelist.contains("a"));
    }

}