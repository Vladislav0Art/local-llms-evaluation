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
public class GeneratedValueOf_UnknownTag_ReturnsNull {

    @Test
    public void valueOf_UnknownTag_ReturnsNull() {
        Tag tag = Tag.valueOf("");
        assertThat(tag, is(null));
    }

}