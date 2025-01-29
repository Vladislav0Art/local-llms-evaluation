package org.jsoup.safety;

import org.junit.jupiter.api.Test;
import org.jsoup.safety.Safelist;
import org.mockito.Mockito;

public class GeneratedNoAttributesTest {

    @Test
    public void noAttributesTest() {
        Safelist noAttributes = new Safelist().noAttributes();
        Mockito.when(noAttributes.getEnforcedAttributes("_a")).thenReturn(new HashSet<>());
        Set<String> result = noAttributes.noAttributes();
        assertEquals(0, result.size());
    }

}