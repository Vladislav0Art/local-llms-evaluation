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
public class GeneratedBasicRemoveAttributesTest {

    @Mock
    private Set<String> safeTags;

    @Mock
    private Set<String> safeAttributes;

    @Test
    public void basicRemoveAttributesTest() {
        Safelist safelist = Safelist.basic().addAttributes("img", "src", "image.jpg");
        safelist = safelist.removeAttributes("img", "src");
        org.junit.Assert.assertFalse(safelist.getEnforcedAttributes("img").contains("src"));
    }

}