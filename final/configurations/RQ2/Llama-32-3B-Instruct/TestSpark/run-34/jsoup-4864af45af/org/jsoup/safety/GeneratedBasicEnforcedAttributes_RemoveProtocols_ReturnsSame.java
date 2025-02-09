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
public class GeneratedBasicEnforcedAttributes_RemoveProtocols_ReturnsSame {

    @Mock
    private Set<String> tags;

    @Test
    public void basicEnforcedAttributes_RemoveProtocols_ReturnsSame() {
        when(tags).thenReturn(new HashSet<>(java.util.Collections.singletonList("tag")));
        Safelist result = Safelist.basic().removeProtocols("tag", "attr1");
        assertNotNull(result);
        assertFalse(Safelist.basic().isSafeAttribute("tag", new Element(), new Attribute("attr1", "")));
    }

}