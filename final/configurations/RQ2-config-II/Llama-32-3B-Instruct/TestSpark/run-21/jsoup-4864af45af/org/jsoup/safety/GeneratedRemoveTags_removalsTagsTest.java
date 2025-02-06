package org.jsoup.safety;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Arrays;

import org.jsoup.helper.Validate;
import org.jsoup.nodes.Attribute;
import org.jsoup.nodes.Attributes;
import org.jsoup.nodes.Element;

public class GeneratedRemoveTags_removalsTagsTest {

    @Test
    public void removeTags_removalsTagsTest() {
        Safelist safelist = Safelist.basic();
        safelist = safelist.removeTags("img");
        assertFalse(safelist.isSafeTag("img"));
    }

}