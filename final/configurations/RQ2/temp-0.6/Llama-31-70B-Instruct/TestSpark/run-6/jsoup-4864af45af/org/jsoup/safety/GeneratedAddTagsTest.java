package org.jsoup.safety;

import static org.junit.Assert.*;

import org.junit.Test;

public class GeneratedAddTagsTest {

    @Test
    public void addTagsTest() {
        Safelist safelist = new Safelist();
        assertEquals(0, safelist.addTags("HTML").size());
    }

}