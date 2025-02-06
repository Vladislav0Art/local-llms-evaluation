package org.jsoup.safety;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import static org.jsoup.internal.Normalizer.lowerCase;
import static org.junit.Assert.assertEquals;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedBasicPreserveRelativeLinks_test {

    @Mock
    private String[] tags;

    public SafelistTest() {
    }

    @Test
    public void basicPreserveRelativeLinks_test() {
        Safelist safelist = Safelist.basic().preserveRelativeLinks(true);
        assertEquals(true, safelist.preserveRelativeLinks(false));
    }

}