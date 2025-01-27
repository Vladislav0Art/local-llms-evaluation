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
public class GeneratedRelaxedRemoveProtocolsTest {

    @Mock
    private Set<String> safeTags;

    @Mock
    private Set<String> safeAttributes;

    @Test
    public void relaxedRemoveProtocolsTest() {
        Safelist safelist = Safelist.relaxed().addProtocols("a", "href", "http://example.com");
        safelist = safelist.removeProtocols("a", "href", "https://example.com");
        org.junit.Assert.assertFalse(safelist.getEnforcedAttributes("a").contains("href"));
    }

}