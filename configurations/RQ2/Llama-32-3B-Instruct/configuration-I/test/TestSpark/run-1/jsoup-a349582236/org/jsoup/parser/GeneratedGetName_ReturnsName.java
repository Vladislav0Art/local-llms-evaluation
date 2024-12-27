package org.jsoup.parser;

import org.jsoup.parser.Tag;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedGetName_ReturnsName {

    @Mock
    private ParseSettings settings;

    @Test
    public void getName_ReturnsName() {
        String expected = "name";
        Tag tag = new Tag();
        Mockito.when(tag.getName()).thenReturn(expected);
        org.junit.Assert.assertEquals(expected, tag.getName());
    }

}