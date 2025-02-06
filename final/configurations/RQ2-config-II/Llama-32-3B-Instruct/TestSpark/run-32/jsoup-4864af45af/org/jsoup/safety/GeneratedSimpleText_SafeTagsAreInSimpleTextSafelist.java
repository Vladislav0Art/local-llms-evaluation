package org.jsoup.safety;

import org.jsoup.safety.Safelist;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.*;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedSimpleText_SafeTagsAreInSimpleTextSafelist {

    @Mock
    private String tag;

    @Test
    public void simpleText_SafeTagsAreInSimpleTextSafelist() {
        when(Safelist.isSafeTag(tag)).thenReturn(true);
        Safelist safelist = Safelist.simpleText();
        assertTrue(safelist.containsTags(new String[]{tag}));
    }

}