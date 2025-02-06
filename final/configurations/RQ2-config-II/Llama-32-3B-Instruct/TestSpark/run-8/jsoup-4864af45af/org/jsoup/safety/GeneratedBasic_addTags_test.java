package org.jsoup.safety;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import static org.jsoup.internal.Normalizer.lowerCase;
import static org.junit.Assert.assertEquals;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedBasic_addTags_test {

    @Mock
    private String[] tags;

    public SafelistTest() {
    }

    @Test
    public void basic_addTags_test() {
        Safelist safelist = Safelist.basic();
        assertEquals("basic", lowerCase(safelist.addTags(tags)));
    }

}