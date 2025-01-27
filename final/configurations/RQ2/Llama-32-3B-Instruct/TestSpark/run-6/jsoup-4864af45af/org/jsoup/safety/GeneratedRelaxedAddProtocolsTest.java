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
public class GeneratedRelaxedAddProtocolsTest {

    @Mock
    private Set<String> safeTags;

    @Mock
    private Set<String> safeAttributes;

    @Test
    public void relaxedAddProtocolsTest() {
        Safelist safelist = Safelist.relaxed().addProtocols("a", "href", "http://example.com");
        Mockito.verify(safeTags).add("a");
        org.junit.Assert.assertTrue(safelist.getEnforcedAttributes("a").contains("href"));
    }

}