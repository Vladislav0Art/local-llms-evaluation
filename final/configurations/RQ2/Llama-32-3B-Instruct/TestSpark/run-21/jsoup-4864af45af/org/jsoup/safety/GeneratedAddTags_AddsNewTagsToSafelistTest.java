package org.jsoup.safety;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Arrays;

public class GeneratedAddTags_AddsNewTagsToSafelistTest {

    @Test
    public void addTags_AddsNewTagsToSafelistTest() {
        Safelist safelist = Safelist.none();
        safelist = Safelist.addTags("img", "p");
        assertTrue(saflist.isSafeTag("img"));
        assertTrue(saflist.isSafeTag("p"));
    }

}