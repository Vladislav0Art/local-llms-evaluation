package org.jsoup.safety;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedIsSafeAttribute_SafeAttributeReturnsTrue {

    @Mock
    private Iterator<String> tagsIterator;

    @Test
    public void isSafeAttribute_SafeAttributeReturnsTrue() {
        String tagName = "tag-name";
        Element el = new Element();
        Attribute attr = new Attribute();
        boolean result = Safelist.isSafeAttribute(tagName, el, attr);
        Mockito.verify(Safelist.class, Mockito.times(1)).isSafeAttribute(Mockito.eq(tagName), Mockito.anyObject(), Mockito.anyObject());
    }

}