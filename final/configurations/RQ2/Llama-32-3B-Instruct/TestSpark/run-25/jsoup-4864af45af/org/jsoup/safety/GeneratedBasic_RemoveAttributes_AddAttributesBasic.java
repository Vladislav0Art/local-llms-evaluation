package org.jsoup.safety;

import org.jsoup.nodes.Attribute;
import org.jsoup.nodes.Attributes;
import org.jsoup.nodes.Element;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.*;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedBasic_RemoveAttributes_AddAttributesBasic {

    @Mock
    private Element element;

    @Test
    public void basic_RemoveAttributes_AddAttributesBasic() {
        Safelist safelist = Safelist.basic();
        Attributes attributes = new Attributes();
        safelist = Safelist.removeAttributes("a", "href", "http://example.com");
        assertNull(Safelist.basic().getEnforcedAttributes("a"));
    }

}