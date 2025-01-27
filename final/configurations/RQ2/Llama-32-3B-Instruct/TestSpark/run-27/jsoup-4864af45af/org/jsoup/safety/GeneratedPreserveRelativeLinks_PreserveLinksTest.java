package org.jsoup.safety;

import org.jsoup.safety.Safelist;
import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Arrays;

public class GeneratedPreserveRelativeLinks_PreserveLinksTest {

    @Test
    public void preserveRelativeLinks_PreserveLinksTest() {
        Safelist safelist = Safelist.preserveRelativeLinks(true);
        assertTrue(safelist.isSafeAttribute("href", null, new Attribute("href", "https://example.com")));
    }

}