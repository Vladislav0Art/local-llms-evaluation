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

public class GeneratedIsSafeTag_ReturnsTrueForSafeTags {

    @Test
    public void isSafeTag_ReturnsTrueForSafeTags() {
        assertTrue(Safelist.basic().isSafeTag("a"));
        assertFalse(Safelist.relaxed().isSafeTag("script"));
    }

}