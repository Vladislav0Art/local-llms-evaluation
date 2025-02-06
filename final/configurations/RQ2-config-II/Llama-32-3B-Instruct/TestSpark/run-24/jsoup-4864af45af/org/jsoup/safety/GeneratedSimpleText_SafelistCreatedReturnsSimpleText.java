package org.jsoup.safety;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedSimpleText_SafelistCreatedReturnsSimpleText {

    @Mock
    private Iterator<String> tagsIterator;

    @Test
    public void simpleText_SafelistCreatedReturnsSimpleText() {
        Safelist safelist = Safelist.simpleText();
        Mockito.verify(safelist).simpleText();
    }

}