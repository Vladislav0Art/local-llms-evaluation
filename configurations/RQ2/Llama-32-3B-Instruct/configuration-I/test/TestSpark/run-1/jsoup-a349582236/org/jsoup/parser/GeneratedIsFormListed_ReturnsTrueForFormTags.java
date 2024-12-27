package org.jsoup.parser;

import org.jsoup.parser.Tag;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedIsFormListed_ReturnsTrueForFormTags {

    @Mock
    private ParseSettings settings;

    @Test
    public void isFormListed_ReturnsTrueForFormTags() {
        Tag tag = new Tag();
        Mockito.when(tag.getName()).thenReturn("form");
        boolean actual = tag.isFormListed();
        org.junit.Assert.assertTrue(actual);
    }

}