package org.jsoup.safety;

import org.junit.jupiter.api.Test;
import org.jsoup.safety.Safelist;
import org.mockito.Mockito;

public class GeneratedSafeTagsOnlyAddAttributeTest {

    @Test
    public void safeTagsOnlyAddAttributeTest() {
        Safelist safeTagsOnlyAddAttribute = new Safelist().safeTagsOnlyAddAttribute();
        Mockito.when(safeTagsOnlyAddAttribute.isSafeTag("img")).thenReturn(false);
        boolean result = safeTagsOnlyAddAttribute.safeTagsOnlyAddAttribute("img");
        assertTrue(result);
    }

}