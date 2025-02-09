package org.jsoup.safety;

import org.jsoup.nodes.Attribute;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.Attributes;
import org.junit.Test;

import java.util.Map;
import java.util.Iterator;

import static org.junit.Assert.*;

public class GeneratedRemoveTagsTest {

    @Test
    public void removeTagsTest() {
        Safelist safelist = new Safelist();
        String[] tags = {"p", "br"};
        safelist.addTags(tags);
        safelist.removeTags("p");
        assertFalse(safelist.isSafeTag("p"));
        assertTrue(safelist.isSafeTag("br"));
    }

}