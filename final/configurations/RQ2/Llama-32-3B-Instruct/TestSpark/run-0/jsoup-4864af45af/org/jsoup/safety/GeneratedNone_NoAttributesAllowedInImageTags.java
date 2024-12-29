package org.jsoup.safety;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.HashSet;

import org.jsoup.nodes.Attribute;
import org.jsoup.nodes.Attributes;
import org.jsoup.nodes.Element;
import org.jsoup.helper.Validate;
import org.jsoup.safety.Safelist;
import org.mockito.Mockito;

public class GeneratedNone_NoAttributesAllowedInImageTags {

    @Test
    public void none_NoAttributesAllowedInImageTags() {
        Safelist safelist = Safelist.none();
        Attributes attributes = new Attributes();
        assertFalse(safelist.isSafeAttribute("img", null, attributes));
    }

}