package org.jsoup.parser;

import org.jsoup.parser.Tag;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedGetNameTest {

    @InjectMocks
    private Tag tag;

    @Mock
    private Tag tagMock;

    @Test
    public void getNameTest() {
        String expectedName = "div";
        when(tag.getName()).thenReturn(expectedName);
        assertEquals(expectedName, tag.getName());
    }

}