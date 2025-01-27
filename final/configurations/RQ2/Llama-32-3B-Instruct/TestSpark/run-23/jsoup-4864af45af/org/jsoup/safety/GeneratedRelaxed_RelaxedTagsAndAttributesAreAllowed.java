package org.jsoup.safety;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Arrays;

import org.jsoup.nodes.Attribute;
import org.jsoup.nodes.Element;
import org.jsoup.helper.Validate;
import org.jsoup.safety.Safelist;

import static org.mockito.Mockito.when;

public class GeneratedRelaxed_RelaxedTagsAndAttributesAreAllowed {

    @Test
    public void relaxed_RelaxedTagsAndAttributesAreAllowed() {
        Safelist safeList = Safelist.relaxed();
        assertTrue(safeList.isSafeTag("div"));
        assertTrue(safeList.isSafeAttribute("id", null, new Attribute()));
        assertFalse(safeList.isSafeTag("script"));
        assertFalse(safeList.isSafeAttribute("src", null, new Attribute()));
    }

}