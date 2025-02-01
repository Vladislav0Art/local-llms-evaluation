package org.jsoup.safety;

import org.junit.Test;
import org.jsoup.nodes.Attribute;
import org.jsoup.nodes.Element;
import org.jsoup.safety.Safelist;

import static org.junit.Assert.*;

public class GeneratedSafelistCopyTest {

    @Test
    public void safelistCopyTest() {
        Safelist safelist = new Safelist();
        safelist.addTags("p");
        Safelist copy = new Safelist(safelist);
        assertTrue(copy.isSafeTag("p"));
    }

}