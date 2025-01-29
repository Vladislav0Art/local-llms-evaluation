package org.jsoup.safety;

import org.jsoup.safety.Safelist;
import org.jsoup.helper.Validate;
import org.junit.Test;

public class GeneratedRemoveTagsWithNonExistingTag {

    @Test
    public void removeTagsWithNonExistingTag() {
        Safelist safelist = Safelist.simpleText();
        String[] tagsToRemove = {"nonExistent"};
        safelist.removeTags(tagsToRemove);
        assertFalse(safelist.isSafeTag("span"));
    }

}