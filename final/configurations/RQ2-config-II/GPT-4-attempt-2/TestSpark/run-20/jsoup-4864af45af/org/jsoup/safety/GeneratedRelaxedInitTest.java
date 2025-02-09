package org.jsoup.safety;

import org.jsoup.nodes.Attribute;
import org.jsoup.nodes.Element;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedRelaxedInitTest {

    @Test
    public void relaxedInitTest() {
        Safelist safelist = Safelist.relaxed();
        assertNotNull(safelist);
    }

}