package org.jsoup.safety;

import org.jsoup.nodes.Element;
import org.jsoup.nodes.Attribute;
import org.jsoup.safety.Safelist;
import org.junit.Test;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

public class GeneratedRemoveAttributesTest {

    @Test
    public void removeAttributesTest() {
        Safelist safelist = new Safelist();
        safelist.addAttributes("a", "href", "title");
        safelist.removeAttributes("a", "title");
    }

}