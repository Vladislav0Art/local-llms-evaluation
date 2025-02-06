package org.jsoup.safety;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedAddEnforcedAttribute_AttributeAddedToSafelist {

    @Mock
    private Iterator<String> tagsIterator;

    @Test
    public void addEnforcedAttribute_AttributeAddedToSafelist() {
        Set<String> expectedAttributes = new HashSet<>();
        expectedAttributes.add("attr1");
        expectedAttributes.add("attr2");
        Safelist safelist = Safelist.addEnforcedAttribute("tag", "attr", "value");
        Mockito.verify(safelist).addEnforcedAttribute(Mockito.anyString(), Mockito.anyString(), Mockito.anyString());
    }

}