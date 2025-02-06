package org.jsoup.safety;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedBasicWithImages_SafelistCreatedReturnsBasicWithImages {

    @Mock
    private Iterator<String> tagsIterator;

    @Test
    public void basicWithImages_SafelistCreatedReturnsBasicWithImages() {
        Safelist safelist = Safelist.basicWithImages();
        Mockito.verify(safelist).basicWithImages();
    }

}