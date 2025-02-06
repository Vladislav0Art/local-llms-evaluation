package org.jsoup.safety;

import org.jsoup.safety.Safelist;
import org.junit.Test;

import static org.junit.Assert.*;

import java.util.HashSet;
import java.util.Set;

public class GeneratedBasic_removeTags {

    @Test
    public void basic_removeTags() {
        Safelist list = Safelist.basic();
        List<String> tags = new ArrayList<>(Arrays.asList("img", "script"));
        Safelist newList = list.removeTags(tags.toArray(new String[0]));
        assertFalse(list.isSafeTag("img"));
        assertFalse(list.isSafeTag("script"));
    }

}