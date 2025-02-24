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
public class GeneratedTest {

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

    @Test
    public void normalNameTest() {
        String expectedName = "div";
        when(tag.normalName()).thenReturn(expectedName);
        assertEquals(expectedName, tag.normalName());
    }

    @Test
    public void valueOfTest() {
        String tagName = "div";
        ParseSettings settings = new ParseSettings();
        when(tag.valueOf(tagName, settings)).thenReturn(tagMock);
        assertEquals(tagMock, tag.valueOf(tagName, settings));
    }

    @Test
    public void isBlockTest() {
        when(tag.isBlock()).thenReturn(true);
        assertEquals(true, tag.isBlock());
    }

    @Test
    public void formatAsBlockTest() {
        when(tag.formatAsBlock()).thenReturn(true);
        assertEquals(true, tag.formatAsBlock());
    }

}