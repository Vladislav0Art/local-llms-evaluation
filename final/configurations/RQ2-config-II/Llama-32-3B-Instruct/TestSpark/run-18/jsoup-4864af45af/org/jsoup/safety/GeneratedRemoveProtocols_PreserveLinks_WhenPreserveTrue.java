package org.jsoup.safety;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.HashSet;
import java.util.Set;

import org.jsoup.helper.Validate;
import org.jsoup.nodes.Attribute;
import org.jsoup.nodes.Attributes;
import org.jsoup.nodes.Element;

import static org.jsoup.internal.Normalizer.lowerCase;
import static org.mockito.Mockito.when;

public class GeneratedRemoveProtocols_PreserveLinks_WhenPreserveTrue {

    @Test
    public void removeProtocols_PreserveLinks_WhenPreserveTrue() {
        Element element = new Element("test");
        Safelist safelist = Safelist.relaxed();
        Set<String> protocols = new HashSet<>();
        when(safelist.isSafeAttribute("href", element, null)).thenReturn(true);
        safelist = safelist.removeProtocols("a", "href", new String[]{"http://example.com"});
        Element result = safelist.apply(element);
        assertEquals(Validate.equals(element, element), Validate.equals(result, element));
    }

}