package org.jsoup.safety;

import org.jsoup.safety.Safelist;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.*;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedRemoveAttributes_SafelistDoesNotContainRemovedAttributes {

    @Mock
    private String tag;

    @Test
    public void removeAttributes_SafelistDoesNotContainRemovedAttributes() {
        Safelist safelist = Safelist.none();
        safelist = safelist.addAttributes("img", "src", "https://example.com/image.jpg");
        safelist = safelist.removeAttributes("img", "src");
        assertEquals(0, safelist.getEnforcedAttributes("img").size());
    }

}