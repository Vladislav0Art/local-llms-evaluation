package org.jsoup.parser;

import org.jsoup.helper.Validate;
import org.jsoup.internal.Normalizer;

import java.util.HashMap;
import java.util.Map;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;
import static org.mockito.Mockito.*;

public class GeneratedIsKnownTagUnknown {

    @Test
    public void isKnownTagUnknown() {
        String unknownTagName = "unknown";
        when(Tag.class.isKnownTag(unknownTagName)).thenReturn(false);

        Tag tag = new Tag(unknownTagName);
        boolean result = tag.isKnownTag();
        assertThat(result, is(false));
    }

}