package org.jsoup.safety;

import org.junit.Test;

import static org.junit.Assert.*;

import org.jsoup.nodes.Attribute;
import org.jsoup.nodes.Attributes;
import org.jsoup.nodes.Element;

public class GeneratedRelaxed_SafelistCreation {

    @Test
    public void relaxed_SafelistCreation() {
        Safelist safelist = Safelist.relaxed();
        assertNotNull(safelist);
    }

}