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
public class GeneratedNormalName_UndefinedTagName_ReturnsUndefinedTagName {

    @Mock
    private ParseSettings parseSettings;

    @Before
    public void setup() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void normalName_UndefinedTagName_ReturnsUndefinedTagName() {
        when(parseSettings.getName()).thenReturn(null);
        assertNotNull(Tag.valueOf("tag").normalName());
    }

}