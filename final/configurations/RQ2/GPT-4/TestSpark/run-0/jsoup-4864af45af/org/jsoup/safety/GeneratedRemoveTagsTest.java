package org.jsoup.safety;

import static org.junit.Assert.*;

import org.jsoup.safety.Safelist;
import org.junit.Test;
import org.jsoup.nodes.Attributes;

public class GeneratedRemoveTagsTest {

    //Testing null variables during instantiation

    @Test
    public void removeTagsTest() {
        Safelist safelist = Safelist.basic();
        safelist = safelist.removeTags("div");
        assertNotNull(safelist);
    }

}