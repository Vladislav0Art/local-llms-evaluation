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

public class GeneratedNone_preserveRelativeLinks_SimpleTextTest {

    @Test
    public void none_preserveRelativeLinks_SimpleTextTest() {
        Safelist nonePreserveImg = Safelist.none().preserveRelativeLinks(true);
        assertTrue(nonePreserveImg.isSafeAttribute("img", null, new Attribute(null, "src", "")));
        assertFalse(nonePreserveImg.isSafeAttribute("p", null, new Attribute(null, "class", "")));
    }

}