package org.jsoup.safety;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Arrays;

import org.jsoup.nodes.Attribute;
import org.jsoup.nodes.Element;

public class GeneratedPreserveRelativeLinks_DontPreserveLinkFlagTest {

    @Test
    public void preserveRelativeLinks_DontPreserveLinkFlagTest() {
        Safelist safelist = Safelist.preserveRelativeLinks(false);
        assertFalse(safelist.addTags("a").get(0).equals("href"));
    }

}