package org.jsoup.safety;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import org.jsoup.nodes.Attribute;
import org.jsoup.nodes.Element;
import org.junit.Test;

public class GeneratedBasicTest {

    @Test
    public void basicTest() {
        Safelist safelist = Safelist.basic();
        assertNotNull(safelist);
    }

}