package org.jsoup.safety;

import org.junit.Test;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

public class GeneratedTestRemoveTags {

    @Test
    public void testRemoveTags() {
        Safelist safelist = new Safelist();
        String[] tags = {"p", "div"};
        safelist.addTags(tags);
        safelist.removeTags(tags);
        assertFalse(safelist.isSafeTag("p"));
        assertFalse(safelist.isSafeTag("div"));
    }

}