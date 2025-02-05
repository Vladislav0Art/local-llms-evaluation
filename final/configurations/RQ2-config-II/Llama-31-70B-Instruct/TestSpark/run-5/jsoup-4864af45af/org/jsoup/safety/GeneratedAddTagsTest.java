package org.jsoup.safety;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedAddTagsTest {

    @Mock
    private Safelist safelist;

    @Test
    public void addTagsTest() {
        when(safelist.addTags("tag1", "tag2")).thenReturn(new Safelist());
        assertEquals(new Safelist(), safelist.addTags("tag1", "tag2"));
    }

}