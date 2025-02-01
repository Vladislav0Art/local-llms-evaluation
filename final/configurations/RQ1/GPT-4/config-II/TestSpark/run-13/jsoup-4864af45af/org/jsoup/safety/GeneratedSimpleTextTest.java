package org.jsoup.safety;

import org.junit.Test;
import org.jsoup.nodes.Attribute;
import org.jsoup.nodes.Element;
import org.jsoup.safety.Safelist;

import static org.junit.Assert.*;

public class GeneratedSimpleTextTest {

    @Test
    public void simpleTextTest() {
        Safelist safelist = Safelist.simpleText();
        assertNotNull(safelist);
    }

}