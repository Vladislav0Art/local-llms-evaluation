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
public class GeneratedNone_addTags_SafelistReturnsEmpty {

    @Mock
    private Attributes attributes;

    @Test
    public void none_addTags_SafelistReturnsEmpty() {
        Safelist safelist = Safelist.none();
        safelist.addTags("newTag");
        assertThat(safelist.getTags(), is(new String[]{"newTag"}));
    }

}