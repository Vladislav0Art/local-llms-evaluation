package org.jsoup.parser;

import org.jsoup.parser.Tag;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedIsFormSubmittable_EmptyTag_RetrunsTrue {

    @Mock
    private ParseSettings parseSettings;

    @InjectMocks
    private Tag tag;

    @Test
    public void isFormSubmittable_EmptyTag_RetrunsTrue() {
        tag.setSelfClosing(true);
        boolean result = tag.isFormSubmittable();
        org.junit.Assert.assertTrue(result);
    }

}