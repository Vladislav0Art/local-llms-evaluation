package org.jsoup.safety;

import org.jsoup.nodes.Attribute;
import org.jsoup.nodes.Element;
import org.jsoup.safety.Safelist;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedSafelistCopyConstructorTest {

    // Testing public static methods

    @Test
    public void SafelistCopyConstructorTest() {
        Safelist original = Safelist.basic();
        Safelist copy = new Safelist(original);
        assertNotNull(copy);
    }

}