package org.jsoup.safety;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Arrays;

import org.jsoup.nodes.Attribute;
import org.jsoup.nodes.Element;
import org.jsoup.helper.Validate;
import org.jsoup.safety.Safelist;

import static org.mockito.Mockito.when;

public class GeneratedBasic_BasicTagsAndAttributesAreAllowed {

    @Test
    public void basic_BasicTagsAndAttributesAreAllowed() {
        Safelist safeList = Safelist.basic();
        assertTrue(safeList.isSafeTag("a"));
        assertTrue(safeList.isSafeAttribute("href", null, new Attribute()));
        assertFalse(safeList.isSafeTag("script"));
        assertFalse(safeList.isSafeAttribute("src", null, new Attribute()));
    }

}