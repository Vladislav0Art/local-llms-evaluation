package org.jsoup.safety;

import org.jsoup.safety.Safelist;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.*;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedAddAttributes_SafelistContainsNewAttributes {

    @Mock
    private String tag;

    @Test
    public void addAttributes_SafelistContainsNewAttributes() {
        Safelist safelist = Safelist.none();
        safelist = safelist.addAttributes("img", "src", "https://example.com/image.jpg");
        assertEquals(1, safelist.getEnforcedAttributes("img").size());
    }

}