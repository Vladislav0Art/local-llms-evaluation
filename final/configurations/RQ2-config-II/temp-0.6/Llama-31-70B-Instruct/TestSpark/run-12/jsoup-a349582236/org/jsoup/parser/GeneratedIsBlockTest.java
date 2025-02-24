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
public class GeneratedIsBlockTest {

    @InjectMocks
    private Tag tag;

    @Mock
    private Tag tagMock;

    @Test
    public void isBlockTest() {
        when(tag.isBlock()).thenReturn(true);
        assertEquals(true, tag.isBlock());
    }

}