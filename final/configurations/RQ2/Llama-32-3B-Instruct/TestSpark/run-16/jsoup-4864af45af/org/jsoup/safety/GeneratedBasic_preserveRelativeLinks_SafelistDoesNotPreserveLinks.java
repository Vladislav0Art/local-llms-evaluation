package org.jsoup.safety;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedBasic_preserveRelativeLinks_SafelistDoesNotPreserveLinks {

    @Mock
    private Attributes attributes;

    @Test
    public void basic_preserveRelativeLinks_SafelistDoesNotPreserveLinks() {
        Safelist safelist = Safelist.basic();
        safelist.preserveRelativeLinks(false);
        assertThat(safelist.isRelativeLink(true), is(false));
    }

}