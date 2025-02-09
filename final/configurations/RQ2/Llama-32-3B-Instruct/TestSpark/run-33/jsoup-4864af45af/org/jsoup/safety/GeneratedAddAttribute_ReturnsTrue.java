package org.jsoup.safety;

import org.jsoup.safety.Safelist;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.Attribute;
import org.mockito.Mockito;

public class GeneratedAddAttribute_ReturnsTrue {

    @Test
    public void addAttribute_ReturnsTrue() {
        Safelist result = new Safelist();
        result.addAttribute("a", "href");
        assertTrue(result.isSafeAttribute("a", "href"));
    }

}