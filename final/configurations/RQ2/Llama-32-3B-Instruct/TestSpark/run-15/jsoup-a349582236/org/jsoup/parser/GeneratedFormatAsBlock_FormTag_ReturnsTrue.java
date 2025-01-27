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
public class GeneratedFormatAsBlock_FormTag_ReturnsTrue {

    @Test
    public void formatAsBlock_FormTag_ReturnsTrue() {
        when(ParseSettings.KNOWN_TAGS).thenReturn(new HashMap<String, String>() {{
            put("form", "block");
        }});
        Tag tag = Tag.valueOf("form");
        assertThat(tag.formatAsBlock(), is(true));
    }

}