package org.jsoup.safety;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import static org.jsoup.internal.Normalizer.lowerCase;
import static org.junit.Assert.assertEquals;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedRelaxed_removeAttributes_test {

    @Mock
    private String[] tags;

    public SafelistTest() {
    }

    @Test
    public void relaxed_removeAttributes_test() {
        Safelist safelist = Safelist.relaxed().addAttributes("a", "href");
        assertEquals(0, safelist.removeAttributes("a", "href"));
    }

}