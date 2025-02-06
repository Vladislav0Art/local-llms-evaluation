package org.jsoup.safety;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.mockito.Mockito;

import static org.junit.Assert.*;
import static org.mockito.Mockito.when;

@RunWith(JUnit4.class)
public class GeneratedRemoveTags_SafelistRemovesTags {

    @Test
    public void removeTags_SafelistRemovesTags() {
        Safelist safelist = Safelist.none();
        String[] tags = {"div", "span"};
        Safelist safelistWithTags = Safelist.addTags(tags);
        assertFalse(safelistWithTags.isSafeTag("div"));
        assertFalse(safelistWithTags.isSafeTag("span"));
    }

}