package org.jsoup.safety;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Set;
import java.util.HashSet;

public class GeneratedIsSafeTag_SafeTagsReturnsTrueTest {

    @Test
    public void isSafeTag_SafeTagsReturnsTrueTest() {
        Safelist safelist = Safelist.basic();
        assertTrue(safelist.isSafeTag("img"));
    }

}