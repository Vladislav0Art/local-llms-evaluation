package org.jsoup.parser;

import org.jsoup.parser.Tag;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedClone_EmptyTag_RetrunsModifiedClone {

    @Mock
    private ParseSettings parseSettings;

    @InjectMocks
    private Tag tag;

    @Test
    public void clone_EmptyTag_RetrunsModifiedClone() {
        Tag modifiedTag = tag.clone();
        org.junit.Assert.assertNotNull(modifiedTag);
    }

}