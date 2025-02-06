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

public class GeneratedNone_addAttributes_SimpleTextTest {

    @Test
    public void none_addAttributes_SimpleTextTest() {
        Safelist noneAddImgAttr = Safelist.none().addAttributes("img", "src", "test.jpg");
        assertTrue(noneAddImgAttr.isSafeAttribute("img", null, new Attribute(null, "src", "test.jpg")));
        assertFalse(noneAddImgAttr.isSafeAttribute("p", null, new Attribute(null, "class", "")));
    }

}