package org.jsoup.safety;

import static org.junit.Assert.*;

import org.jsoup.safety.Safelist;
import org.junit.Test;
import org.jsoup.nodes.Attributes;

public class GeneratedAddTagsTest {

    //Testing null variables during instantiation

    @Test
    public void addTagsTest() {
        Safelist safelist = Safelist.basic();
        safelist = safelist.addTags("p");
        assertNotNull(safelist);
    }

}