package org.jsoup.safety;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Arrays;

import org.jsoup.helper.Validate;
import org.jsoup.nodes.Attribute;
import org.jsoup.nodes.Attributes;
import org.jsoup.nodes.Element;

public class GeneratedAddProtocols_addsProtocolsTest {

    @Test
    public void addProtocols_addsProtocolsTest() {
        Safelist safelist = Safelist.addTags("img", "src");
        assertEquals(1, safelist.getEnforcedAttributes("img").size());
        safelist = safelist.removeProtocols("img", "src");
        assertFalse(safelist.getEnforcedAttributes("img").containsKey("src"));
    }

}