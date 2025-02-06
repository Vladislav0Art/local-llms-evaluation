package org.jsoup.safety;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.HashSet;
import java.util.Set;

import org.jsoup.nodes.Element;
import org.jsoup.nodes.Attribute;
import org.jsoup.nodes.Attributes;
import org.jsoup.helper.Validate;
import org.jsoup.internal.Normalizer.lowerCase;

public class GeneratedBasic_SafelistContainsBasicTags {

    @Test
    public void basic_SafelistContainsBasicTags() {
        Safelist safelist = Safelist.basic();
        assertTrue(safelist.isSafeTag("h1"));
        assertTrue(safelist.isSafeTag("h2"));
    }

}