package org.jsoup.safety;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.HashSet;
import java.util.Set;

public class GeneratedBasic_EnforcedAttributes TagName {

    @Test
    public void basic_EnforcedAttributes

    TagName() {
        Safelist basic = Safelist.basic();
        Set<String> expectedTags = new HashSet<>();
        expectedTags.add("img");
        assertEquals(expectedTags, basic.getEnforcedAttributes("img"));
    }

}