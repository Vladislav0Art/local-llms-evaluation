package org.jsoup.safety;

import org.junit.Test;

import static org.junit.Assert.*;

import org.jsoup.nodes.Attribute;
import org.jsoup.nodes.Attributes;
import org.jsoup.nodes.Element;

public class GeneratedBasic_SafelistCreation {

    @Test
    public void basic_SafelistCreation() {
        Safelist safelist = Safelist.basic();
        assertNotNull(safelist);
    }

}