package org.jsoup.safety;

import org.junit.Test;
import org.jsoup.helper.Validate;
import org.jsoup.nodes.Attribute;
import org.jsoup.nodes.Attributes;
import org.jsoup.nodes.Element;
import org.mockito.Mockito;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

import static org.junit.Assert.*;
import static org.jsoup.internal.Normalizer.lowerCase;

public class GeneratedTest {

    // Test for none() method

    @Test
    public void noneTest() {
        Safelist safelist = Safelist.none();
        assertNotNull(safelist);
        assertTrue(safelist.getProtocols().isEmpty());
        assertTrue(safelist.getEnforcedAttributes().isEmpty());
        assertTrue(safelist.getProtocols().isEmpty());
        assertFalse(safelist.isSafeTag("div"));
    }

    @Test
    public void simpleTextTest() {
        Safelist safelist = Safelist.simpleText();
        assertNotNull(safelist);
        assertTrue(safelist.getProtocols().isEmpty());
        assertTrue(safelist.getEnforcedAttributes().isEmpty());
        assertTrue(safelist.getProtocols().isEmpty());
        assertTrue(safelist.isSafeTag("div"));
    }

}