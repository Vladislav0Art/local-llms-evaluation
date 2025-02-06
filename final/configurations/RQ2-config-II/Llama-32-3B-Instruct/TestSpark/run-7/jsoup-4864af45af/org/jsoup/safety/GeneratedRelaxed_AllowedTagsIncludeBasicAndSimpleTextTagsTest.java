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

public class GeneratedRelaxed_AllowedTagsIncludeBasicAndSimpleTextTagsTest {

    @Test
    public void relaxed_AllowedTagsIncludeBasicAndSimpleTextTagsTest() {
        Set<String> safeTags = new HashSet<>();
        safeTags.addAll(Safelist.basic().getSafeTags());
        safeTags.addAll(Safelist.simpleText().getSafeTags());
        Safelist safelist = Safelist.relaxed();
        assertTrue(safelist.isSafeTag("img"));
    }

}