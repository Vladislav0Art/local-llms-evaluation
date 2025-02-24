package org.jsoup.safety;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedRemoveTagsTest {

    @Mock
    private Safelist safelist;

    @Test
    public void removeTagsTest() {
        when(safelist.removeTags("tag1", "tag2")).thenReturn(safelist);
        assertEquals(safelist, safelist.removeTags("tag1", "tag2"));
    }

}