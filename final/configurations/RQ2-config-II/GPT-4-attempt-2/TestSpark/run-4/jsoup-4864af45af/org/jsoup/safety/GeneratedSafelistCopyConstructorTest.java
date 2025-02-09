package org.jsoup.safety;

import org.jsoup.nodes.Attributes;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.Attribute;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedSafelistCopyConstructorTest {

    @Test
    public void safelistCopyConstructorTest() {
        Safelist sl = Safelist.none();
        sl.addTags("test");
        Safelist slCopy = new Safelist(sl);
        assertTrue(slCopy.isSafeTag("test"));
    }

}