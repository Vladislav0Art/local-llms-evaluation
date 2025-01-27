package org.jsoup.safety;

import org.jsoup.safety.Safelist;
import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Arrays;

public class GeneratedRemoveTags_RemoveTagsTest {

    @Test
    public void removeTags_RemoveTagsTest() {
        Safelist safelist = Safelist.removeTags("tag");
        assertFalse(safelist.isSafeTag("tag"));
    }

}