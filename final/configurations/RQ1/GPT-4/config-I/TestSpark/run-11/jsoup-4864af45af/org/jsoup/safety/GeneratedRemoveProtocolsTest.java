package org.jsoup.safety;

import org.jsoup.nodes.Attributes;
import org.jsoup.nodes.Element;
import org.junit.Test;
import org.mockito.Mockito;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class GeneratedRemoveProtocolsTest {

    @Test
    public void removeProtocolsTest() {
        Safelist safelist = new Safelist();
        safelist.addProtocols("img", "src", "https");
        safelist.removeProtocols("img", "src", "https");
        Element element = new Element("img");
        element.attr("src", "https://test.com/image.jpg");
        assertFalse(safelist.isSafeAttribute("img", element, element.attributes().asList().get(0)));
    }

}