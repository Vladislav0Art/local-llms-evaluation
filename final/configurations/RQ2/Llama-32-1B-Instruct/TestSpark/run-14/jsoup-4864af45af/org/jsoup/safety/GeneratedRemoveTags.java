package org.jsoup.safety;

import org.jsoup.safety.Safelist;
import org.jsoup.helper.Validate;
import org.junit.Test;

public class GeneratedRemoveTags {

    @Test
    public void removeTags() {
        Safelist safelist = Safelist.simpleText();
        String[] tagsToRemove = {"img"};
        safelist.removeTags(tagsToRemove);
        assertTrue(safelist.isSafeTag("span"));
    }

}