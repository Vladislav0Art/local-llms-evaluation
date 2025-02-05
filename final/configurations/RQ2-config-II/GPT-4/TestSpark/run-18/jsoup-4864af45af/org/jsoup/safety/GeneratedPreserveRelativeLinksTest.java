package org.jsoup.safety;

import org.jsoup.nodes.Attribute;
import org.jsoup.nodes.Element;
import org.jsoup.safety.Safelist;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedPreserveRelativeLinksTest {

    @Test
    public void preserveRelativeLinksTest() {
        final Safelist safelist = new Safelist();
        safelist.preserveRelativeLinks(true);
        assertTrue(safelist.preserveRelativeLinks(false));
    }

}