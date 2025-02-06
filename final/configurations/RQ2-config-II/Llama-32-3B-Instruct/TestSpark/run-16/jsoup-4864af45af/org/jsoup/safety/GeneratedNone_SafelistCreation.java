package org.jsoup.safety;

import org.junit.Test;

import static org.junit.Assert.*;

import org.jsoup.nodes.Attribute;
import org.jsoup.nodes.Attributes;
import org.jsoup.nodes.Element;

public class GeneratedNone_SafelistCreation {

    @Test
    public void none_SafelistCreation() {
        Safelist safelist = Safelist.none();
        assertNotNull(safelist);
    }

}