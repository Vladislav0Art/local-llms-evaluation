package org.jsoup.safety;

import static org.junit.Assert.*;

import org.jsoup.safety.Safelist;
import org.junit.Test;
import org.jsoup.nodes.Attributes;

public class GeneratedPreserveRelativeLinksTest {

    //Testing null variables during instantiation

    @Test
    public void preserveRelativeLinksTest() {
        Safelist safelist = Safelist.basic();
        safelist = safelist.preserveRelativeLinks(true);
        assertNotNull(safelist);
    }

}