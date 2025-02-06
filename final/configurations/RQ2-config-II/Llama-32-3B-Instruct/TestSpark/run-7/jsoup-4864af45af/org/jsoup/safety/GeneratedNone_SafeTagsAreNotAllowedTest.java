package org.jsoup.safety;

import org.jsoup.helper.Validate;
import org.junit.Test;

import static org.junit.Assert.*;

import org.jsoup.nodes.Attribute;
import org.jsoup.nodes.Attributes;
import org.jsoup.nodes.Element;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class GeneratedNone_SafeTagsAreNotAllowedTest {

    @Test
    public void none_SafeTagsAreNotAllowedTest() {
        Set<String> safeTags = new HashSet<>();
        assertFalse(Safelist.none().isSafeTag("script"));
    }

}