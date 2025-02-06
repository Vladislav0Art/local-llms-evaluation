package org.jsoup.safety;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedRemoveEnforcedAttribute_AttributeRemovedFromSafelist {

    @Mock
    private Iterator<String> tagsIterator;

    @Test
    public void removeEnforcedAttribute_AttributeRemovedFromSafelist() {
        Set<String> expectedAttributes = new HashSet<>();
        expectedAttributes.add("attr1");
        expectedAttributes.add("attr2");
        Safelist safelist = Safelist.removeEnforcedAttribute("tag", "attr");
        Mockito.verify(safelist).removeEnforcedAttribute(Mockito.anyString(), Mockito.anyString());
    }

}