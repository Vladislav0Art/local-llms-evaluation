package org.jsoup.safety;

import static org.junit.Assert.*;

import org.jsoup.safety.Safelist;
import org.junit.Test;
import org.jsoup.nodes.Attributes;

public class GeneratedAddAttributesTest {

    //Testing null variables during instantiation

    @Test
    public void addAttributesTest() {
        Safelist safelist = Safelist.basic();
        safelist = safelist.addAttributes("img", "alt");
        assertNotNull(safelist);
    }

}