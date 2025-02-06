package org.jsoup.safety;

import org.jsoup.safety.Safelist;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.*;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedBasic_SafeTagsAreNotInBasicSafelist {

    @Mock
    private String tag;

    @Test
    public void basic_SafeTagsAreNotInBasicSafelist() {
        when(Safelist.isSafeTag(tag)).thenReturn(false);
        Safelist safelist = Safelist.basic();
        assertFalse(safelist.containsTags(new String[]{tag}));
    }

}