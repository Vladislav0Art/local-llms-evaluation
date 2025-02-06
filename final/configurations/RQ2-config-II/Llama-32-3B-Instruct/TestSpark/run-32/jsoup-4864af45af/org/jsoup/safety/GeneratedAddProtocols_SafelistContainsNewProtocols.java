package org.jsoup.safety;

import org.jsoup.safety.Safelist;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.*;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedAddProtocols_SafelistContainsNewProtocols {

    @Mock
    private String tag;

    @Test
    public void addProtocols_SafelistContainsNewProtocols() {
        Safelist safelist = Safelist.none();
        safelist = safelist.addProtocols("img", "src", "https://example.com/image.jpg");
        assertEquals(1, safelist.getEnforcedAttributes("img").size());
    }

}