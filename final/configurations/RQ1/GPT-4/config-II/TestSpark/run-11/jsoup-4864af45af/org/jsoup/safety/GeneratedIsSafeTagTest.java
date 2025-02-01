package org.jsoup.safety;

import org.jsoup.nodes.Attribute;
import org.jsoup.nodes.Element;
import org.jsoup.safety.Safelist;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedIsSafeTagTest {

    @Test
    public void isSafeTagTest() {
        Safelist safelist = new Safelist();
        safelist.addTags("p");
        assertTrue(safelist.isSafeTag("p"));
    }

}