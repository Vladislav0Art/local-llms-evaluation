package org.jsoup.safety;

import org.junit.Test;
import org.jsoup.nodes.Attribute;
import org.jsoup.nodes.Element;
import org.jsoup.safety.Safelist;

import static org.junit.Assert.*;

public class GeneratedAddAttributesTest {

    private Safelist safelist = new Safelist();

    @Test
    public void addAttributesTest() {
        String tag = "div";
        String[] attributes = {"id", "class"};
        Safelist newSafelist = safelist.addAttributes(tag, attributes);
        assertNotNull(newSafelist);
    }

}