package org.jsoup.safety;

import static org.jsoup.internal.Normalizer.lowerCase;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import org.jsoup.nodes.Attribute;
import org.jsoup.nodes.Attributes;
import org.jsoup.nodes.Element;
import org.junit.Test;

public class GeneratedTest {

    private Safelist safelist;

    @Test
    public void noneTest() {
        safelist = Safelist.none();
        assertTrue(safelist.getProtocols().isEmpty());
        assertTrue(safelist.getEnforcedAttributes().isEmpty());
        assertTrue(safelist.getProtocols().isEmpty());
        assertTrue(safelist.getProtocols().isEmpty());
        assertFalse(safelist.isSafeTag("a"));
    }

    @Test
    public void simpleTextTest() {
        safelist = Safelist.simpleText();
        assertTrue(safelist.isSafeTag("a"));
        assertFalse(safelist.isSafeTag("script"));
    }

    @Test
    public void basicTest() {
        safelist = Safelist.basic();
        assertTrue(safelist.isSafeTag("a"));
        assertTrue(safelist.isSafeTag("b"));
        assertFalse(safelist.isSafeTag("script"));
    }

}