package org.jsoup.safety;

import org.jsoup.nodes.Attribute;
import org.jsoup.nodes.Element;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedSimpleTextInitTest {

    @Test
    public void simpleTextInitTest() {
        Safelist safelist = Safelist.simpleText();
        assertNotNull(safelist);
    }

}