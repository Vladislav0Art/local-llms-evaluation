package org.jsoup.safety;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import static org.jsoup.internal.Normalizer.lowerCase;
import static org.junit.Assert.assertEquals;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedSimpleText_isSafeAttribute_test {

    @Mock
    private String[] tags;

    public SafelistTest() {
    }

    @Test
    public void simpleText_isSafeAttribute_test() {
        Safelist safelist = Safelist.simpleText().addAttributes("img", "src");
        assertEquals(true, safelist.isSafeAttribute("img", Mockito.mock(Element.class), Mockito.mock(Attribute.class)));
    }

}