package org.jsoup.safety;

import org.jsoup.safety.Safelist;
import org.jsoup.nodes.Attributes;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedPreserveRelativeLinksTest {

    @Test
    public void preserveRelativeLinksTest() {
        Safelist safelist = new Safelist().preserveRelativeLinks(true);
        assertNotNull(safelist);
    }

}