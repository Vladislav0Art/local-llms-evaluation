package org.jsoup.safety;

import org.jsoup.safety.Safelist;
import org.jsoup.nodes.Attributes;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedRemoveTagsTest {

    @Test
    public void removeTagsTest() {
        Safelist safelist = new Safelist().removeTags("a", "b");
        assertNotNull(safelist);
    }

}