package org.jsoup.safety;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedGetEnforcedAttributes_EnforcedAttributesReturnsSet {

    @Mock
    private Iterator<String> tagsIterator;

    @Test
    public void getEnforcedAttributes_EnforcedAttributesReturnsSet() {
        String tagName = "tag-name";
        Set<String> result = Safelist.getEnforcedAttributes(tagName);
        Mockito.verify(Safelist.class, Mockito.times(1)).getEnforcedAttributes(Mockito.eq(tagName));
    }

}