package org.jsoup.safety;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;
import static org.mockito.Mockito.when;

public class GeneratedAddTags[]

Test {

    @Test
    public void addTags[] Test() {
        Safelist safelist = Safelist.addTags("strong", "b");
        assertTrue(safelist.isSafeTag("strong"));
        assertTrue(safelist.isSafeTag("b"));
    }

}