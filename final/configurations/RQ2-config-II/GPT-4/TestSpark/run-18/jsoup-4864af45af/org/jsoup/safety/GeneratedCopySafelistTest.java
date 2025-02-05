package org.jsoup.safety;

import org.jsoup.nodes.Attribute;
import org.jsoup.nodes.Element;
import org.jsoup.safety.Safelist;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedCopySafelistTest {

    @Test
    public void copySafelistTest() {
        final Safelist safelist1 = Safelist.basic();
        final Safelist safelist2 = new Safelist(safelist1);
        assertNotNull(safelist2);
    }

}