package org.jsoup.safety;

import org.jsoup.helper.Validate;
import org.jsoup.nodes.Attribute;
import org.jsoup.nodes.Attributes;
import org.jsoup.nodes.Element;
import org.junit.Test;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

public class GeneratedTest {

    @Test
    public void noneTest() {
        Safelist safelist = Safelist.none();
        assertNotNull(safelist);
        assertTrue(safelist.getTags().isEmpty());
        assertTrue(safelist.getAttributes().isEmpty());
        assertTrue(safelist.getProtocols().isEmpty());
    }

    @Test
    public void simpleTextTest() {
        Safelist safelist = Safelist.simpleText();
        assertNotNull(safelist);
        assertEquals(1, safelist.getTags().size());
        assertTrue(safelist.getTags().contains("b"));
        assertTrue(safelist.getAttributes().isEmpty());
        assertTrue(safelist.getProtocols().isEmpty());
    }

}