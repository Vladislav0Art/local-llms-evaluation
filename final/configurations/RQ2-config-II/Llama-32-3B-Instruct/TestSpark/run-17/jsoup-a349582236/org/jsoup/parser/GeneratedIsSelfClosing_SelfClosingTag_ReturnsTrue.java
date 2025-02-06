package org.jsoup.parser;

import org.jsoup.parser.ParseSettings;
import org.junit.Test;
import org.mockito.Mockito;

public class GeneratedIsSelfClosing_SelfClosingTag_ReturnsTrue {

    @Test
    public void isSelfClosing_SelfClosingTag_ReturnsTrue() {
        Tag tag = new Tag();
        assertTrue(tag.isSelfClosing());
    }

}