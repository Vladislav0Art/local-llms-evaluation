package org.jsoup.safety;

import org.jsoup.safety.Safelist;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.*;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedAddTags_SafelistContainsNewTags {

    @Mock
    private String tag;

    @Test
    public void addTags_SafelistContainsNewTags() {
        Safelist safelist = Safelist.none();
        safelist = safelist.addTags("a", "b");
        assertTrue(safelist.containsTags(new String[]{"a", "b"}));
    }

}