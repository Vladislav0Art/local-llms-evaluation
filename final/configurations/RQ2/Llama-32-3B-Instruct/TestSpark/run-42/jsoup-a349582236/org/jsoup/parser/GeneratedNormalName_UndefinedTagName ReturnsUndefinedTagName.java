package org.jsoup.parser;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.jsoup.helper.Validate;

import static org.junit.Assert.*;
import static org.mockito.Mockito.when;
import static org.mockito.Mockito.mock;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedNormalName_UndefinedTagName ReturnsUndefinedTagName {

    @Mock
    private ParseSettings parseSettings;

    @Test
    public void normalName_UndefinedTagName

    ReturnsUndefinedTagName() {
        when(parseSettings.getName()).thenReturn(null);
        assertNotNull(Tag.valueOf("tag").normalName());
    }

}