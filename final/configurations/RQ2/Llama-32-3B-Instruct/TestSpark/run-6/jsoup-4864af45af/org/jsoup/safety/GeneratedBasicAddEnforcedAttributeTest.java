package org.jsoup.safety;

import org.jsoup.helper.Validate;
import org.jsoup.nodes.Attribute;
import org.jsoup.nodes.Attributes;
import org.jsoup.nodes.Element;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedBasicAddEnforcedAttributeTest {

    @Mock
    private Set<String> safeTags;

    @Mock
    private Set<String> safeAttributes;

    @Test
    public void basicAddEnforcedAttributeTest() {
        Safelist safelist = Safelist.basic().addEnforcedAttribute("img", "alt", "image.jpg");
        Mockito.verify(safeTags).add("img");
        org.junit.Assert.assertTrue(safelist.getEnforcedAttributes("img").contains("alt"));
    }

}