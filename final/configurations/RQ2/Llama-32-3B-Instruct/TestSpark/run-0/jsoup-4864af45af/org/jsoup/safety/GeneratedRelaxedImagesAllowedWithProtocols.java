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

public class GeneratedRelaxedImagesAllowedWithProtocols {

    @Test
    public void relaxedImagesAllowedWithProtocols() {
        Safelist safelist = Safelist.relaxed();
        assertTrue(safelist.isSafeTag("img"));
        assertTrue(safelist.isSafeTag("img", Arrays.asList("http://example.com")));
    }

}