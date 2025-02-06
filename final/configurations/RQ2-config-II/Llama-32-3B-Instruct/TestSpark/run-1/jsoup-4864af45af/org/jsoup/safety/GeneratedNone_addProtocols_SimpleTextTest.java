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

public class GeneratedNone_addProtocols_SimpleTextTest {

    @Test
    public void none_addProtocols_SimpleTextTest() {
        Safelist noneAddImgAttr = Safelist.none().addProtocols("img", "src", Arrays.asList("https://example.com"));
        assertTrue(noneAddImgAttr.isSafeAttribute("img", null, new Attribute(null, "src", "https://example.com")));
    }

}