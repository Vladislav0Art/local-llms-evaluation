package org.jsoup.safety;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.*;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedAddTagsTest {

    @Mock
    private Safelist mockSafelist;

    @Test
    public void addTagsTest() {
        Safelist safelist = new Safelist();
        String[] tags = {"div", "span"};
        safelist.addTags(tags);
        assertNotNull(safelist);
    }

}