package org.jsoup.safety;

import org.jsoup.safety.Safelist;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.*;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedIsSafeTag_ReturnsFalseForNotSafeTags {

    @Mock
    private String tag;

    @Test
    public void isSafeTag_ReturnsFalseForNotSafeTags() {
        when(Safelist.isSafeTag(tag)).thenReturn(false);
        assertTrue(!Safelist.basic().containsTags(new String[]{tag}));
    }

}