package org.jsoup.safety;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;
import static org.mockito.Mockito.when;

public class GeneratedBasic[]

Test {

    @Test
    public void basic[] Test() {
        Safelist safelist = Safelist.basic();
        assertThat(safelist.isSafeTag("img"), is(false));
        assertThat(safelist.isSafeAttribute("img", null, null), is(false));
    }

}