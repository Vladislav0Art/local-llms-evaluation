package org.jsoup.safety;

import org.jsoup.safety.Safelist;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.*;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedRemoveProtocols_SafelistDoesNotContainRemovedProtocols {

    @Mock
    private String tag;

    @Test
    public void removeProtocols_SafelistDoesNotContainRemovedProtocols() {
        Safelist safelist = Safelist.none();
        safelist = safelist.addProtocols("img", "src", "https://example.com/image.jpg");
        safelist = safelist.removeProtocols("img", "src", new String[]{"https://example.com"});
        assertEquals(0, safelist.getEnforcedAttributes("img").size());
    }

}