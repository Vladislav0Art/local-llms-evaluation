package org.jsoup.parser;

import org.jsoup.helper.Validate;
import org.jsoup.internal.Normalizer;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.*;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedSetSelfClosing_SettingSelfClosingReturnsNewTag {

    @Mock
    private ParseSettings parseSettings;

    @Test
    public void setSelfClosing_SettingSelfClosingReturnsNewTag() {
        String name = "some";
        Tag originalTag = new Tag();
        originalTag.setName(name);
        Tag newTag = new Tag();
        newTag.setSelfClosing(originalTag.isSelfClosing());
        assertTrue(newTag.isSelfClosing());
    }

}