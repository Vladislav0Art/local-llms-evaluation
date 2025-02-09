package org.jsoup.parser;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;
import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedTestUnknownTagFormatAsInline {

    @Mock
    private ParseSettings parseSettings;

    public TagParser tagParser = new TagParser();

    @Test
    public void testUnknownTagFormatAsInline() {
        when(parseSettings.isKnownTag(anyString())).thenReturn(false);
        when(tagParser.formatTag(new TagBuilder())).thenReturn("unknown");
        assertThat(tagParser.formatTag(new TagBuilder()), is("unknown"));
    }

}