package org.jsoup.safety;

import org.jsoup.safety.Safelist;
import org.jsoup.nodes.Attribute;
import org.jsoup.nodes.Attributes;
import org.jsoup.nodes.Element;
import org.jsoup.helper.Validate;

import java.util.HashSet;
import java.util.Set;

import static org.junit.Assert.*;
import static org.junit.Test;

public class GeneratedBasic_SimpleTagsAndAttributes {

    @Test
    public void basic_SimpleTagsAndAttributes() {
        Safelist safeList = Safelist.basic();
        assertEquals(new HashSet<>(Arrays.asList("img", "br", "p")), safeList.getEnforcedAttributes("body"));
    }

}