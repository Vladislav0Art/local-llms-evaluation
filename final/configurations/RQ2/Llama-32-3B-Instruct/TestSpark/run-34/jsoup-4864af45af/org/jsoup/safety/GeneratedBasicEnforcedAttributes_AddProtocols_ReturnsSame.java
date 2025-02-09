package org.jsoup.safety;

import org.jsoup.helper.Validate;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.*;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedBasicEnforcedAttributes_AddProtocols_ReturnsSame {

    @Mock
    private Set<String> tags;

    @Test
    public void basicEnforcedAttributes_AddProtocols_ReturnsSame() {
        when(tags).thenReturn(new HashSet<>(java.util.Collections.singletonList("tag")));
        Safelist result = Safelist.basic().addProtocols("tag", "attr1", "http");
        assertNotNull(result);
        assertTrue(Safelist.basic().isSafeAttribute("tag", new Element(), new Attribute("attr1", "http")));
    }

}