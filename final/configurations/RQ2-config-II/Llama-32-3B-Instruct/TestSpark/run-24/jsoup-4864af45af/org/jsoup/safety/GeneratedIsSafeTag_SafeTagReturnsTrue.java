package org.jsoup.safety;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedIsSafeTag_SafeTagReturnsTrue {

    @Mock
    private Iterator<String> tagsIterator;

    @Test
    public void isSafeTag_SafeTagReturnsTrue() {
        String tag = "safe-tag";
        boolean result = Safelist.isSafeTag(tag);
        Mockito.verify(Safelist.class, Mockito.times(1)).isSafeTag(Mockito.eq(tag));
    }

}