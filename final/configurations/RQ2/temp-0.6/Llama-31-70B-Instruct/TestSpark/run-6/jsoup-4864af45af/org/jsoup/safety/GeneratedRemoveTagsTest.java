package org.jsoup.safety;

import static org.junit.Assert.*;

import org.junit.Test;

public class GeneratedRemoveTagsTest {

    @Test
    public void removeTagsTest() {
        Safelist safelist = new Safelist();
        assertEquals(0, safelist.removeTags("HTML").size());
    }

}