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
public class GeneratedBasicRemoveAttributes_RemoveTags_ReturnsSame {

    @Mock
    private Set<String> tags;

    @Test
    public void basicRemoveAttributes_RemoveTags_ReturnsSame() {
        when(tags).thenReturn(new HashSet<>(java.util.Collections.singletonList("tag")));
        Safelist result = Safelist.basic().removeTags("tag");
        assertNotNull(result);
        assertFalse(Safelist.basic().isSafeTag("tag"));
    }

}