package org.jsoup.safety;

import org.jsoup.nodes.Attributes;
import org.jsoup.safety.Safelist;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedAddAttributesTest {

    @Test
    public void addAttributesTest() {
        Safelist safelist = new Safelist();
        String tag = "p";
        String attr = "align";
        safelist.addAttributes(tag, attr);
        assertTrue(safelist.addAttributes(tag, attr).isTagAttributes("align"));
    }

}