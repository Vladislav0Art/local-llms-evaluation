package org.jsoup.safety;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Arrays;

import org.jsoup.nodes.Attribute;
import org.jsoup.nodes.Element;
import org.jsoup.helper.Validate;
import org.jsoup.safety.Safelist;

import static org.mockito.Mockito.when;

public class GeneratedAddTags_AddedTagsAreAllowed {

    @Test
    public void addTags_AddedTagsAreAllowed() {
        Safelist safeList = Safelist.addTags("div");
        assertTrue(safeList.isSafeTag("div"));
        assertFalse(safeList.isSafeTag("script"));
    }

}