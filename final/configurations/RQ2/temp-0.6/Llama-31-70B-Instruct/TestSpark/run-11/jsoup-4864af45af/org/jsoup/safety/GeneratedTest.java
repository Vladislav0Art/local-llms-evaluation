package org.jsoup.safety;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedTest {

    @Mock
    private Safelist safelist;

    @Test
    public void simpleTextTest() {
        when(safelist.simpleText()).thenReturn(safelist);
        assertEquals(safelist, safelist.simpleText());
    }

    @Test
    public void basicTest() {
        when(safelist.basic()).thenReturn(safelist);
        assertEquals(safelist, safelist.basic());
    }

    @Test
    public void basicWithImagesTest() {
        when(safelist.basicWithImages()).thenReturn(safelist);
        assertEquals(safelist, safelist.basicWithImages());
    }

    @Test
    public void relaxedTest() {
        when(safelist.relaxed()).thenReturn(safelist);
        assertEquals(safelist, safelist.relaxed());
    }

    @Test
    public void addTagsTest() {
        when(safelist.addTags("tag1", "tag2")).thenReturn(safelist);
        assertEquals(safelist, safelist.addTags("tag1", "tag2"));
    }

    @Test
    public void removeTagsTest() {
        when(safelist.removeTags("tag1", "tag2")).thenReturn(safelist);
        assertEquals(safelist, safelist.removeTags("tag1", "tag2"));
    }

}