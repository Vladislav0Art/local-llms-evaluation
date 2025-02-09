package org.jsoup.safety;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;
import static org.mockito.Mockito.when;

public class GeneratedAddAttributes[]

Test {

    @Test
    public void addAttributes[] Test() {
        Safelist safelist = Safelist.addAttributes("a", "href", "https://example.com");
        assertTrue(safelist.isSafeAttribute("a", null, null));
    }

}