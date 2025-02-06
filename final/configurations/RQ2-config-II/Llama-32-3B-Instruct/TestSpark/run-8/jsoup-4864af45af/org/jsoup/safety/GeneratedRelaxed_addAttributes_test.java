package org.jsoup.safety;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import static org.jsoup.internal.Normalizer.lowerCase;
import static org.junit.Assert.assertEquals;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedRelaxed_addAttributes_test {

    @Mock
    private String[] tags;

    public SafelistTest() {
    }

    @Test
    public void relaxed_addAttributes_test() {
        Safelist safelist = Safelist.relaxed();
        assertEquals(0, safelist.addAttributes("a", "href"));
    }

}