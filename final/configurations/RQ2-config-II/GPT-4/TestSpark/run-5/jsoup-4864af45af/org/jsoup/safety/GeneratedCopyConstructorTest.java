package org.jsoup.safety;

import org.jsoup.nodes.Attribute;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.Attributes;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedCopyConstructorTest {

    @Test
    public void copyConstructorTest() {
        Safelist input = Safelist.basic();
        Safelist result = new Safelist(input);
        assertNotNull(result);
        assertEquals(input, result);
    }

}