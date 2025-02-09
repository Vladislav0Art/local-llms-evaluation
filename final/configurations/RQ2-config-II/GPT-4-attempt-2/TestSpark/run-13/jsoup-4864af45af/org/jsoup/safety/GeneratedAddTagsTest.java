package org.jsoup.safety;

import org.jsoup.nodes.Attribute;
import org.jsoup.nodes.Element;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedAddTagsTest {

    @Test
    public void addTagsTest() {
        Safelist safelist = new Safelist();

        safelist.addTags("p", "a");

        // No API to verify the addition, so checking with safety function
        assertTrue(safelist.isSafeTag("p"));
    }

}