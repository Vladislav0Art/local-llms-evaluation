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

public class GeneratedRelaxed_SafelistContainsRelaxedTags {

    @Test
    public void relaxed_SafelistContainsRelaxedTags() {
        Safelist safelist = Safelist.relaxed();
        assertTrue(safelist.isSafeTag("span"));
        assertTrue(safelist.isSafeTag("div"));
    }

}