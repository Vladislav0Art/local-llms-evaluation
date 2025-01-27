package org.jsoup.safety;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Arrays;

public class GeneratedRemoveTags_RemovesNewlyAddedTagsFromSafelistTest {

    @Test
    public void removeTags_RemovesNewlyAddedTagsFromSafelistTest() {
        Safelist safelist = Safelist.none();
        safelist = Safelist.addTags("img", "p");
        safelist = Safelist.removeTags("img", "p");
        assertFalse(saflist.isSafeTag("img"));
        assertFalse(saflist.isSafeTag("p"));
    }

}