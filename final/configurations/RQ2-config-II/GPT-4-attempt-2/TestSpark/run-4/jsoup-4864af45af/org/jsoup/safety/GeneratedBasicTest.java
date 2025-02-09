package org.jsoup.safety;

import org.jsoup.nodes.Attributes;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.Attribute;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedBasicTest {

    @Test
    public void basicTest() {
        Safelist result = Safelist.basic();
        assertNotNull(result);
    }

}