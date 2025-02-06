package org.jsoup.safety;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import static org.jsoup.internal.Normalizer.lowerCase;
import static org.junit.Assert.assertEquals;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedBasic_getEnforcedAttributes_test {

    @Mock
    private String[] tags;

    public SafelistTest() {
    }

    @Test
    public void basic_getEnforcedAttributes_test() {
        Safelist safelist = Safelist.basic().addAttributes("a", "href");
        assertEquals(1, safelist.getEnforcedAttributes("a").size());
    }

}