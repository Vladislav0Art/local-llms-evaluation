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
public class GeneratedNone_SafelistReturnsEmpty {

    @Mock
    private Attributes attributes;

    @Test
    public void none_SafelistReturnsEmpty() {
        Safelist safelist = Safelist.none();
        assertThat(safelist.getTags(), is(new String[0]));
        assertThat(safelist.getAttributeNames(), is(new String[0]));
    }

}