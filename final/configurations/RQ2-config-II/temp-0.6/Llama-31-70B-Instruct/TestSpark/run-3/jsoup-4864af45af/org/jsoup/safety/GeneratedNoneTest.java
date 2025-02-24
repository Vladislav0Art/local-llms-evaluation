package org.jsoup.safety;

import org.jsoup.helper.Validate;
import org.jsoup.nodes.Attribute;
import org.jsoup.nodes.Attributes;
import org.jsoup.nodes.Element;
import org.jsoup.safety.Safelist;
import org.junit.Test;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

import static org.jsoup.internal.Normalizer.lowerCase;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class GeneratedNoneTest {

    @Test
    public void noneTest() {
        Safelist safelist = Safelist.none();
        assertTrue(safelist.getProtocols().isEmpty());
        assertTrue(safelist.getAttributes().isEmpty());
        assertTrue(safelist.getEnforcedAttributes().isEmpty());
        assertTrue(safelist.getProtocols().isEmpty());
        assertTrue(safelist.getTags().isEmpty());
    }

}