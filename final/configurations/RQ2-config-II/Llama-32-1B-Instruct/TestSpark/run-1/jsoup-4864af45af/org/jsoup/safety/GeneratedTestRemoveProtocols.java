package org.jsoup.safety;

import org.jsoup.nodes.Attribute;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.Node;
import org.jsoup.select.Elements;

public class GeneratedTestRemoveProtocols {

    @Test
    public void testRemoveProtocols() {
        Safelist safelist = new Safelist();
        safelist.removeProtocols("a", "rel='stylesheet'");
        Assert.assertTrue(safelist.getEnforcedAttributes("a").isEmpty());
    }

}