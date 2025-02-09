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
public class GeneratedNone_AddTags_ReturnsSame {

    @Mock
    private Set<String> tags;

    @Test
    public void none_AddTags_ReturnsSame() {
        when(tags).thenReturn(new HashSet<>());
        Safelist result = Safelist.none().addTags("tag");
        assertNotNull(result);
        assertTrue(Safelist.none().isSafeTag("tag"));
    }

}