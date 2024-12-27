package org.jsoup.safety;

import org.jsoup.nodes.Attribute;
import org.jsoup.nodes.Attributes;
import org.jsoup.nodes.Element;
import org.jsoup.safety.Safelist;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedSafelistCopyConstructorTest {

    @Test
    public void safelistCopyConstructorTest() {
        Safelist safelist1 = Safelist.none();
        Safelist safelist2 = new Safelist(safelist1);
        assertNotNull(safelist2);
    }

}