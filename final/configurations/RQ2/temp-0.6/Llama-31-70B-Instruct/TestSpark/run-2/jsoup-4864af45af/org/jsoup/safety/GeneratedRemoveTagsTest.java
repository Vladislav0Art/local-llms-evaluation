package org.jsoup.safety;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.*;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedRemoveTagsTest {

    @Mock
    private Safelist safelist;

    @Test
    public void removeTagsTest() {
        String[] tags = new String[]{"div", "p"};
        Safelist actual = safelist.removeTags(tags);
        assertNotNull(actual);
    }

}