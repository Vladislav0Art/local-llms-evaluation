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

public class GeneratedNone_SafeTags {

    @Test
    public void none_SafeTags() {
        Safelist safeList = Safelist.none();
        assertTrue(safeList.isSafeTag("img"));
        assertFalse(safeList.isSafeTag("script"));
    }

}