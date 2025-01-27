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

public class GeneratedNone_EmptySafelist_ReturnsNone {

    @Test
    public void none_EmptySafelist_ReturnsNone() {
        Safelist safelist = Safelist.none();
        assertNotNull(safelist);
        assertTrue(safelist.isEmpty());
    }

}