package org.jsoup.safety;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedNone_SafelistCreatedReturnsNone {

    @Mock
    private Iterator<String> tagsIterator;

    @Test
    public void none_SafelistCreatedReturnsNone() {
        Safelist safelist = Safelist.none();
        Mockito.verify(safelist).none();
    }

}