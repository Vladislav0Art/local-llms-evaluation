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
public class GeneratedIsEmpty_EmptyTag_ReturnsTrue {

    @Test
    public void isEmpty_EmptyTag_ReturnsTrue() {
        when(ParseSettings.KNOWN_TAGS).thenReturn(new HashMap<String, String>() {{
            put("", "");
        }});
        Tag tag = Tag.valueOf("");
        assertThat(tag.isEmpty(), is(true));
    }

}