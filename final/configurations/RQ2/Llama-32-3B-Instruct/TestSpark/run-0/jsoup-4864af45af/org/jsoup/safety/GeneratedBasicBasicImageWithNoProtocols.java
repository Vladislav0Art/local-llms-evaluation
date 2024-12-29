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

public class GeneratedBasicBasicImageWithNoProtocols {

    @Test
    public void basicBasicImageWithNoProtocols() {
        Safelist safelist = Safelist.basic();
        assertTrue(safelist.isSafeTag("img"));
        assertFalse(safelist.isSafeAttribute("img", null, new Attribute()));
    }

}