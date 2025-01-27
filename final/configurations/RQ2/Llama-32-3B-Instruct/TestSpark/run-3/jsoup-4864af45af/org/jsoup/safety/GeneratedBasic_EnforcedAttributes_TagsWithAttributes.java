package org.jsoup.safety;

import org.jsoup.nodes.Attribute;
import org.junit.Test;

import static org.junit.Assert.*;

import java.util.HashSet;

public class GeneratedBasic_EnforcedAttributes_TagsWithAttributes {

    @Test
    public void basic_EnforcedAttributes_TagsWithAttributes() {
        Safelist basic = Safelist.basic();
        Set<String> expectedTags = new HashSet<>();
        expectedTags.add("img");
        assertEquals(expectedTags, basic.getEnforcedAttributes("img"));
    }

}