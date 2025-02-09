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
public class GeneratedBasicAddAttributes_AddAttributes_ReturnsSame {

    @Mock
    private Set<String> tags;

    @Test
    public void basicAddAttributes_AddAttributes_ReturnsSame() {
        when(tags).thenReturn(new HashSet<>(java.util.Collections.singletonList("tag")));
        Safelist result = Safelist.basic().addAttributes("tag", "attr1", "value1");
        assertNotNull(result);
        assertTrue(Safelist.basic().isSafeAttribute("tag", new Element(), new Attribute("attr1", "value1")));
    }

}