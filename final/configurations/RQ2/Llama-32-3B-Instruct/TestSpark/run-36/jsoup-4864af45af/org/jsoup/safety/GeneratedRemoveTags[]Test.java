package org.jsoup.safety;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;
import static org.mockito.Mockito.when;

public class GeneratedRemoveTags[]

Test {

    @Test
    public void removeTags[] Test() {
        Safelist safelist = Safelist.basic();
        Safelist newSafelist = safelist.removeTags("strong", "b");
        assertFalse(newSafelist.isSafeTag("strong"));
        assertFalse(newSafelist.isSafeTag("b"));
    }

}