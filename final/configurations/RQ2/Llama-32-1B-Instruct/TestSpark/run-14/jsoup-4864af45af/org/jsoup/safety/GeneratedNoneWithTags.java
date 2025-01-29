package org.jsoup.safety;

import org.jsoup.safety.Safelist;
import org.jsoup.helper.Validate;
import org.junit.Test;

public class GeneratedNoneWithTags {

    @Test
    public void noneWithTags() {
        Safelist safelist = Safelist.none().addTags("a", "b");
        assertNotNull(safelist);
    }

}