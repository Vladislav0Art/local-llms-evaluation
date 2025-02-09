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
public class GeneratedTestNotBlockFormatAsInline {

    @Mock
    private ParseSettings parseSettings;

    public TagParser tagParser = new TagParser();

    @Test
    public void testNotBlockFormatAsInline() {
        when(parseSettings.isKnownTag("p")).thenReturn(true);
        when(tagParser.formatTag(new TagBuilder())).thenReturn("<p>example</p>");
        assertThat(tagParser.formatTag(new TagBuilder()), is("<p>example</p>"));
    }
}

class TagParser {
    public Tag formatTag(TagBuilder tagBuilder) {
        return new Tag();
    }

    public void parseTag(String tagName) {
    }
}

class ParseSettings {
}

class TagBuilder {
}

}