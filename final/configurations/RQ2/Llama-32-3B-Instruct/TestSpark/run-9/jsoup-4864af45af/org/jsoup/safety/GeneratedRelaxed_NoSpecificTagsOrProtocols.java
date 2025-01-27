package org.jsoup.safety;

import org.jsoup.safety.Safelist;
import org.jsoup.nodes.Attribute;
import org.jsoup.nodes.Attributes;
import org.jsoup.nodes.Element;
import org.jsoup.helper.Validate;

import java.util.HashSet;
import java.util.Set;

import static org.junit.Assert.*;
import static org.junit.Test;

public class GeneratedRelaxed_NoSpecificTagsOrProtocols {

    @Test
    public void relaxed_NoSpecificTagsOrProtocols() {
        Safelist safeList = Safelist.relaxed();
        assertTrue(safeList.isSafeTag("div"));
        assertFalse(safeList.isSafeTag("script"));
    }

}