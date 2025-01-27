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
public class GeneratedSimpleText_removeTags_SafelistDoesNotContainRemovedTags {

    @Mock
    private Attributes attributes;

    @Test
    public void simpleText_removeTags_SafelistDoesNotContainRemovedTags() {
        Safelist safelist = Safelist.simpleText();
        safelist.removeTags("removedTag");
        assertThat(safelist.getTags(), is(new String[]{"p", "span"}));
    }

}