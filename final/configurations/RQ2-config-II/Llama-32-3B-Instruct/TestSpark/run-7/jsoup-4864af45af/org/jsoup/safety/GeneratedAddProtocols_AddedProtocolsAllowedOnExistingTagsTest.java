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

public class GeneratedAddProtocols_AddedProtocolsAllowedOnExistingTagsTest {

    @Test
    public void addProtocols_AddedProtocolsAllowedOnExistingTagsTest() {
        Set<String> safeTags = new HashSet<>();
        safeTags.addAll(Safelist.addTags("img").getSafeTags());
        Safelist safelist = Safelist.addProtocols("img", "src", "https://example.com/image.jpg");
        assertTrue(safelist.isSafeAttribute("", null, new Attribute("", "", "https://example.com/image.jpg")));
    }

}