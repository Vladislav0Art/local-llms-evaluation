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

public class GeneratedRemoveProtocols_ExistingAllowedProtocolsNotRemovedTest {

    @Test
    public void removeProtocols_ExistingAllowedProtocolsNotRemovedTest() {
        Set<String> safeTags = new HashSet<>();
        safeTags.addAll(Safelist.addTags("img").getSafeTags());
        Safelist safelist = Safelist.removeProtocols("script", "src");
        assertTrue(safelist.isSafeAttribute("", null, new Attribute("", "", "")));
    }

}