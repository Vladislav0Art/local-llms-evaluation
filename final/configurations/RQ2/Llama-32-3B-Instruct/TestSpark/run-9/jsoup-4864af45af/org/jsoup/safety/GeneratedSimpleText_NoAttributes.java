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

public class GeneratedSimpleText_NoAttributes {

    @Test
    public void simpleText_NoAttributes() {
        Safelist safeList = Safelist.simpleText();
        assertNull(safeList.getEnforcedAttributes("div"));
    }

}