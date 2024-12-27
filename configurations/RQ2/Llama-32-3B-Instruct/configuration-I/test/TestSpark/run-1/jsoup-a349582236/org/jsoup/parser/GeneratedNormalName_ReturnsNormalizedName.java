package org.jsoup.parser;

import org.jsoup.parser.Tag;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedNormalName_ReturnsNormalizedName {

    @Mock
    private ParseSettings settings;

    @Test
    public void normalName_ReturnsNormalizedName() {
        String expected = "normal-name";
        Tag tag = new Tag();
        Mockito.when(tag.getName()).thenReturn("name");
        String actual = tag.normalName();
        org.junit.Assert.assertEquals(expected, actual);
    }

}