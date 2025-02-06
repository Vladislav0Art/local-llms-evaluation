package org.jsoup.safety;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedAddTags_TagAddedToSafelist {

    @Mock
    private Iterator<String> tagsIterator;

    @Test
    public void addTags_TagAddedToSafelist() {
        Set<String> expectedTags = new HashSet<>();
        expectedTags.add("tag1");
        expectedTags.add("tag2");
        Safelist safelist = Safelist.addTags(expectedTags.toArray(new String[0]));
        Mockito.verify(safelist).addTags(Mockito.anyArray());
    }

}