package org.jsoup.safety;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.HashSet;
import java.util.Set;

import org.jsoup.nodes.Element;
import org.jsoup.nodes.Attribute;
import org.jsoup.nodes.Attributes;
import org.jsoup.helper.Validate;
import org.jsoup.internal.Normalizer.lowerCase;

public class GeneratedNone_SafelistReturnsNone {

    @Test
    public void none_SafelistReturnsNone() {
        Safelist safelist = Safelist.none();
        assertEquals(Safelist.none(), safelist);
    }

}