package org.jsoup.safety;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedAddAttributes_AttributeAddedToSafelist {

    @Mock
    private Iterator<String> tagsIterator;

    @Test
    public void addAttributes_AttributeAddedToSafelist() {
        Set<String> expectedAttributes = new HashSet<>();
        expectedAttributes.add("attr1");
        expectedAttributes.add("attr2");
        Safelist safelist = Safelist.addAttributes(expectedTags.toArray(new String[0]), expectedAttributes);
        Mockito.verify(safelist).addAttributes(Mockito.anyArray(), Mockito.anySet());
    }

}