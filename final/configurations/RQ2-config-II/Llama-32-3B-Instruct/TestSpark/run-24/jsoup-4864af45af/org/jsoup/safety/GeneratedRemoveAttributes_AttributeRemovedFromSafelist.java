package org.jsoup.safety;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedRemoveAttributes_AttributeRemovedFromSafelist {

    @Mock
    private Iterator<String> tagsIterator;

    @Test
    public void removeAttributes_AttributeRemovedFromSafelist() {
        Set<String> expectedAttributes = new HashSet<>();
        expectedAttributes.add("attr1");
        expectedAttributes.add("attr2");
        Safelist safelist = Safelist.removeAttributes(expectedTags.toArray(new String[0]), expectedAttributes);
        Mockito.verify(safelist).removeAttributes(Mockito.anyArray(), Mockito.anySet());
    }

}