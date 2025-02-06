package org.jsoup.safety;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedRemoveTags_TagRemovedFromSafelist {

    @Mock
    private Iterator<String> tagsIterator;

    @Test
    public void removeTags_TagRemovedFromSafelist() {
        Set<String> expectedTags = new HashSet<>();
        expectedTags.add("tag1");
        expectedTags.add("tag2");
        Safelist safelist = Safelist.removeTags(expectedTags.toArray(new String[0]));
        Mockito.verify(safelist).removeTags(Mockito.anyArray());
    }

}