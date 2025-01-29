package org.jsoup.safety;

import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class GeneratedTestAddTags {

    @Test
    public void testAddTags() {
        Safelist safelist = new Safelist().simpleText();
        safelist.addTags("img", "alt");
        assertTrue(Safelist.simpleText().isSafeTag("img-alt"));
    }

}