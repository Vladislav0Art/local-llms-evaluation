package org.jsoup.safety;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.mockito.Mockito;

import static org.junit.Assert.*;
import static org.mockito.Mockito.when;

@RunWith(JUnit4.class)
public class GeneratedAddTags_SafelistAddsTags {

    @Test
    public void addTags_SafelistAddsTags() {
        Safelist safelist = Safelist.none();
        String[] tags = {"div", "span"};
        Safelist safelistWithTags = Safelist.addTags(tags);
        assertTrue(safelistWithTags.isSafeTag("div"));
        assertTrue(safelistWithTags.isSafeTag("span"));
    }

}