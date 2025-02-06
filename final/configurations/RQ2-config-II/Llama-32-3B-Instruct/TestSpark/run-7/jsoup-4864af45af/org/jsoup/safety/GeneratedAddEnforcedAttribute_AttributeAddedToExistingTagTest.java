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

public class GeneratedAddEnforcedAttribute_AttributeAddedToExistingTagTest {

    @Test
    public void addEnforcedAttribute_AttributeAddedToExistingTagTest() {
        Set<String> safeTags = new HashSet<>();
        safeTags.addAll(Safelist.addTags("img").getSafeTags());
        Safelist safelist = Safelist.addEnforcedAttribute("img", "alt", "https://example.com/image.jpg");
        assertTrue(safelist.isSafeAttribute("img", null, new Attribute("", "", "https://example.com/image.jpg")));
    }

}