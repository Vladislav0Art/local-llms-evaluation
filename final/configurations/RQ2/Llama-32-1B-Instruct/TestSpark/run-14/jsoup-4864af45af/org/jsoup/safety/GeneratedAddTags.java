package org.jsoup.safety;

import org.jsoup.safety.Safelist;
import org.jsoup.helper.Validate;
import org.junit.Test;

public class GeneratedAddTags {

    @Test
    public void addTags() {
        Safelist safelist = Safelist.none().addTags("a", "b");
        safelist.addTags("c", "d");
        assertNotNull(safelist);
    }

}