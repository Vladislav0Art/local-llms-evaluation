package org.jsoup.parser;

import org.jsoup.parser.ParseSettings;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;
import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedValueOf_KnownTag_ReturnsInitializedTag {

    @Test
    public void valueOf_KnownTag_ReturnsInitializedTag() {
        when(ParseSettings.KNOWN_TAGS).thenReturn(new HashMap<String, String>() {{
            put("div", "div");
        }});
        Tag tag = Tag.valueOf("div");
        assertThat(tag.getName(), is("div"));
    }

}