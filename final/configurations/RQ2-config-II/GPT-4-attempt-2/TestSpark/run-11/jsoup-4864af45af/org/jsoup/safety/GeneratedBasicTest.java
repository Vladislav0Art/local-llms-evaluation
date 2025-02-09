package org.jsoup.safety;

import org.jsoup.nodes.Attribute;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.Attributes;
import org.junit.Test;

import java.util.Map;
import java.util.Iterator;

import static org.junit.Assert.*;

public class GeneratedBasicTest {

    @Test
    public void basicTest() {
        Safelist safelist = Safelist.basic();
        assertNotNull(safelist);
    }

}