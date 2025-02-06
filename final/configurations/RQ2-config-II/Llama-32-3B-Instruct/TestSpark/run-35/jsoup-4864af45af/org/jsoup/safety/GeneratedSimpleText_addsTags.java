package org.jsoup.safety;

import org.jsoup.safety.Safelist;
import org.junit.Test;

import static org.junit.Assert.*;

import java.util.HashSet;
import java.util.Set;

public class GeneratedSimpleText_addsTags {

    @Test
    public void simpleText_addsTags() {
        Safelist list = Safelist.simpleText();
        List<String> tags = new ArrayList<>(Arrays.asList("b", "strong"));
        Safelist newList = list.addTags(tags.toArray(new String[0]));
        assertTrue(list.isSafeTag("b"));
        assertTrue(list.isSafeTag("strong"));
    }

}