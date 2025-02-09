package org.jsoup.safety;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;
import static org.mockito.Mockito.when;

public class GeneratedSimpleText[]

Test {

    @Test
    public void simpleText[] Test() {
        Safelist safelist = Safelist.simpleText();
        assertThat(safelist.isSafeTag("a"), is(true));
        assertThat(safelist.isSafeAttribute("a", null, null), is(true));
    }

}