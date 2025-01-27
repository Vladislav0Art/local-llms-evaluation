package org.jsoup.safety;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Arrays;

import org.jsoup.nodes.Attribute;
import org.jsoup.nodes.Element;
import org.jsoup.helper.Validate;
import org.jsoup.safety.Safelist;

import static org.mockito.Mockito.when;

public class GeneratedSimpleText_SimpleTagsAreAllowed {

    @Test
    public void simpleText_SimpleTagsAreAllowed() {
        Safelist safeList = Safelist.simpleText();
        assertTrue(safeList.isSafeTag("img"));
        assertFalse(safeList.isSafeTag("script"));
    }

}