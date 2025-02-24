package org.jsoup.safety;

import org.junit.Test;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

public class GeneratedTestAddTags {

    @Test
    public void testAddTags() {
        Safelist safelist = new Safelist();
        String[] tags = {"p", "div"};
        safelist.addTags(tags);
        assertTrue(safelist.isSafeTag("p"));
        assertTrue(safelist.isSafeTag("div"));
    }

}