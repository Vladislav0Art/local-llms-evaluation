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

public class GeneratedBasic_removeProtocols_SimpleTextTest {

    @Test
    public void basic_removeProtocols_SimpleTextTest() {
        Safelist basicRemoveImgAttr = Safelist.basic().removeProtocols("img", "src", Arrays.asList("https://example.com"));
        assertTrue(basicRemoveImgAttr.isSafeAttribute("img", null, new Attribute(null, "class", "")));
    }

}