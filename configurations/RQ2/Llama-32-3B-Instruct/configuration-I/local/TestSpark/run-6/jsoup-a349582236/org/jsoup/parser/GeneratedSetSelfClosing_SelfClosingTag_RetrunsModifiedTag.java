package org.jsoup.parser;

import org.jsoup.parser.Tag;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedSetSelfClosing_SelfClosingTag_RetrunsModifiedTag {

    @Mock
    private ParseSettings parseSettings;

    @InjectMocks
    private Tag tag;

    @Test
    public void setSelfClosing_SelfClosingTag_RetrunsModifiedTag() {
        Tag modifiedTag = tag.setSelfClosing();
        org.junit.Assert.assertNotNull(modifiedTag);
    }

}