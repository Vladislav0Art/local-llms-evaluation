package org.jsoup.safety;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import static org.jsoup.internal.Normalizer.lowerCase;
import static org.junit.Assert.assertEquals;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedNone_addEnforcedAttribute_test {

    @Mock
    private String[] tags;

    public SafelistTest() {
    }

    @Test
    public void none_addEnforcedAttribute_test() {
        Safelist safelist = Safelist.none();
        assertEquals(0, safelist.addEnforcedAttribute("div", "data-foo", "bar"));
    }

}