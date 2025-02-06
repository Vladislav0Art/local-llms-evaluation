package org.jsoup.safety;

import org.jsoup.nodes.Attribute;
import org.jsoup.nodes.Attributes;
import org.jsoup.nodes.Element;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class GeneratedAddEnforcedAttribute_addEnforcedAttribute {

    @Test
    public void addEnforcedAttribute_addEnforcedAttribute() {
        Safelist safelist = Safelist.relaxed().addEnforcedAttribute("div", "data-id", "12345");
        assertTrue(safelist.getEnforcedAttributes("div").containsKey("data-id"));
        assertFalse(safelist.getEnforcedAttributes("img").containsKey("data-id"));
    }

}