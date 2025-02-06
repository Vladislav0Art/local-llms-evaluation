package org.jsoup.safety;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedRelaxed_SafelistCreatedReturnsRelaxed {

    @Mock
    private Iterator<String> tagsIterator;

    @Test
    public void relaxed_SafelistCreatedReturnsRelaxed() {
        Safelist safelist = Safelist.relaxed();
        Mockito.verify(safelist).relaxed();
    }

}