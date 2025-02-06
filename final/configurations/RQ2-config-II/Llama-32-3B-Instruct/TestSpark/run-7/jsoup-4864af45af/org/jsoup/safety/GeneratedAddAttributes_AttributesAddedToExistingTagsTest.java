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

public class GeneratedAddAttributes_AttributesAddedToExistingTagsTest {

    @Test
    public void addAttributes_AttributesAddedToExistingTagsTest() {
        Set<String> safeTags = new HashSet<>();
        safeTags.addAll(Safelist.addTags("a", "img").getSafeTags());
        Safelist safelist = Safelist.addAttributes("a", "href", "https://example.com");
        assertTrue(safelist.isSafeAttribute("a", null, new Attribute("", "", "https://example.com")));
    }

}