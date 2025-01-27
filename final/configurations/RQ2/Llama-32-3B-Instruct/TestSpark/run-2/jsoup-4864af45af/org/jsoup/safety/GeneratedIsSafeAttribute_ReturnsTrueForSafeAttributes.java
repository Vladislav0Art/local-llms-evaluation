package org.jsoup.safety;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.HashSet;
import java.util.Set;

import org.jsoup.nodes.Attribute;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.Attributes;
import org.jsoup.helper.Validate;
import org.jsoup.internal.Normalizer;

public class GeneratedIsSafeAttribute_ReturnsTrueForSafeAttributes {

    @Test
    public void isSafeAttribute_ReturnsTrueForSafeAttributes() {
        Safelist safelist = Safelist.relaxed();
        assertNotNull(safelist);
        assertEquals(true, safelist.isSafeAttribute("img", new Element(), new Attribute()));
    }

}