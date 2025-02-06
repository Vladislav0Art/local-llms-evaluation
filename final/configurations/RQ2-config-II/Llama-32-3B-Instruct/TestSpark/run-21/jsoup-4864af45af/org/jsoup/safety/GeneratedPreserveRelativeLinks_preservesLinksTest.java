package org.jsoup.safety;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Arrays;

import org.jsoup.helper.Validate;
import org.jsoup.nodes.Attribute;
import org.jsoup.nodes.Attributes;
import org.jsoup.nodes.Element;

public class GeneratedPreserveRelativeLinks_preservesLinksTest {

    @Test
    public void preserveRelativeLinks_preservesLinksTest() {
        Safelist safelist = Safelist.preserveRelativeLinks(true);
        assertTrue(safelist.isSafeAttribute("", null, null));
    }

}