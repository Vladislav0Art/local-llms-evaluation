package org.jsoup.parser;

import org.jsoup.parser.ParseSettings;
import org.junit.Test;
import org.mockito.Mockito;

public class GeneratedSetSelfClosing_SettingSelfClosingReturnsNewTagWithSelfClosingFlag {

    @Test
    public void setSelfClosing_SettingSelfClosingReturnsNewTagWithSelfClosingFlag() {
        Tag originalTag = new Tag();
        Tag newTag = originalTag.setSelfClosing();
        assertTrue(newTag.isSelfClosing());
    }

}