package org.jsoup.safety;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

import org.jsoup.nodes.Attribute;
import org.jsoup.nodes.Attributes;
import org.jsoup.nodes.Element;
import org.jsoup.helper.Validate;

public class GeneratedBasic_addEnforcedAttributes_SimpleTextTest {

    @Test
    public void basic_addEnforcedAttributes_SimpleTextTest() {
        Safelist basicAttr = Safelist.basic().addEnforcedAttribute("img", "src", "test.jpg");
        assertTrue(basicAttr.isSafeAttribute("img", null, new Attribute(null, "src", "test.jpg")));
        assertFalse(basicAttr.isSafeAttribute("p", null, new Attribute(null, "class", "")));
    }

}