package org.jsoup.safety;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.*;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedAddTagsTest {

    @Mock
    private Safelist safelist;

    @Test
    public void addTagsTest() {
        String[] tags = new String[]{"div", "p"};
        Safelist actual = safelist.addTags(tags);
        assertNotNull(actual);
    }

}