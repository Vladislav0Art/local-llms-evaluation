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
public class GeneratedNormalNameTest {

    @InjectMocks
    private Tag tag;

    @Mock
    private Tag tagMock;

    @Test
    public void normalNameTest() {
        String expectedName = "div";
        when(tag.normalName()).thenReturn(expectedName);
        assertEquals(expectedName, tag.normalName());
    }

}