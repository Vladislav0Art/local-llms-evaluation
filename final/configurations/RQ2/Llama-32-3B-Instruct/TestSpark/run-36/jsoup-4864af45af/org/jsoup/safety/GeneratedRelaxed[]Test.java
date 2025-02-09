package org.jsoup.safety;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;
import static org.mockito.Mockito.when;

public class GeneratedRelaxed[]

Test {

    @Test
    public void relaxed[] Test() {
        Safelist safelist = Safelist.relaxed();
        assertThat(safelist.isSafeTag("img"), is(true));
        assertThat(safelist.isSafeAttribute("img", null, null), is(false));
    }

}