package org.jsoup.parser;

import org.jsoup.parser.Tag;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedIsSelfClosing_ReturnsFalseForNonSelfClosingTags {

    @Mock
    private ParseSettings settings;

    @Test
    public void isSelfClosing_ReturnsFalseForNonSelfClosingTags() {
        Tag tag = new Tag();
        Mockito.when(tag.getName()).thenReturn("span");
        boolean actual = tag.isSelfClosing();
        org.junit.Assert.assertFalse(actual);
    }

}