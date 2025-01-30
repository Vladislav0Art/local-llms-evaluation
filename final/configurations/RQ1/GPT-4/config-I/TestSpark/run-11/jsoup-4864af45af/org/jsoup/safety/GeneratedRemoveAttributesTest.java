package org.jsoup.safety;

import org.jsoup.nodes.Attributes;
import org.jsoup.nodes.Element;
import org.junit.Test;
import org.mockito.Mockito;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class GeneratedRemoveAttributesTest {

    @Test
    public void removeAttributesTest() {
        Safelist safelist = new Safelist();
        safelist.addAttributes("img", "src");
        safelist.removeAttributes("img", "src");
        Element element = new Element("img");
        element.attr("src", "http://test.com/image.jpg");
        assertFalse(safelist.isSafeAttribute("img", element, element.attributes().asList().get(0)));
    }

}