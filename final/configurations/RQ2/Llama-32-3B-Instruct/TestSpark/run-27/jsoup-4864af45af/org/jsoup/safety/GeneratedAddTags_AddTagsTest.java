package org.jsoup.safety;

import org.jsoup.safety.Safelist;
import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Arrays;

public class GeneratedAddTags_AddTagsTest {

    @Test
    public void addTags_AddTagsTest() {
        Safelist safelist = Safelist.addTags("tag");
        assertTrue(safelist.isSafeTag("tag"));
    }

}