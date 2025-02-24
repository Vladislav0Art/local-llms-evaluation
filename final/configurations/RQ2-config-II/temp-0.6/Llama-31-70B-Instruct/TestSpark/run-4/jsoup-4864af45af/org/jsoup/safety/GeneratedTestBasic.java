package org.jsoup.safety;

import org.jsoup.safety.Safelist;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.Attribute;
import org.jsoup.nodes.Attributes;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedTestBasic {

    @Test
    public void testBasic() {
        Safelist actual = Safelist.basic();
        assertNotNull(actual);
    }

}