package org.jsoup.safety;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;
import static org.mockito.Mockito.when;

public class GeneratedBasicWithImages[]

Test {

    @Test
    public void basicWithImages[] Test() {
        Safelist safelist = Safelist.basicWithImages();
        assertThat(safelist.isSafeTag("img"), is(true));
        assertThat(safelist.isSafeAttribute("img", null, null), is(true));
    }

}