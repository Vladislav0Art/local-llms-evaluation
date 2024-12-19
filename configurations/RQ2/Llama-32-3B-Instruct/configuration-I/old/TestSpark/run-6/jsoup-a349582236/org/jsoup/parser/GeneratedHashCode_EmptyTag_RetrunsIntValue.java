package org.jsoup.parser;

import org.jsoup.parser.Tag;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedHashCode_EmptyTag_RetrunsIntValue {

    @Mock
    private ParseSettings parseSettings;

    @InjectMocks
    private Tag tag;

    @Test
    public void hashCode_EmptyTag_RetrunsIntValue() {
        int result = tag.hashCode();
        org.junit.Assert.assertTrue(result != 0);
    }

}