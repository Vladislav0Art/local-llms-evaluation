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
public class GeneratedRelaxed_SafelistContainsAllBasicTagsAndMore {

    @Mock
    private Attributes attributes;

    @Test
    public void relaxed_SafelistContainsAllBasicTagsAndMore() {
        Safelist safelist = Safelist.relaxed();
        assertThat(safelist.getTags(), is(new String[]{"img", "br", "hr", "p", "div", "a", "ul", "ol"}));
    }

}