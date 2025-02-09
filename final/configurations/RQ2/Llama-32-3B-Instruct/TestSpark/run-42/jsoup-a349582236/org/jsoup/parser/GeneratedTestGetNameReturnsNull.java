package org.jsoup.parser;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedTestGetNameReturnsNull {

    @Mock
    private ParseSettings parseSettings;

    public TagTest() {
        MockitoAnnotations.initMocks(this);
    }

    public String getName() {
        return "";
    }

    @org.junit.Before
    public void setup() {
        // No need for Before annotation, use it in your test class instead
    }

    @Test
    public void testGetNameReturnsNull() {
        when(parseSettings.getName()).thenReturn(null);
        // Test code here...
    }

}