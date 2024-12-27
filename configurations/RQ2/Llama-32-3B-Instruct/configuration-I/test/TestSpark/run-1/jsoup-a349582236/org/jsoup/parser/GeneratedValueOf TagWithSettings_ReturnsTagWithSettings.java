package org.jsoup.parser;

import org.jsoup.parser.Tag;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedValueOf TagWithSettings_ReturnsTagWithSettings {

    @Mock
    private ParseSettings settings;

    @Test
    public void valueOf

    TagWithSettings_ReturnsTagWithSettings() {
        String tagName = "tag";
        Tag expected = new Tag();
        org.junit.Assert.assertTrue(Tag.valueOf(tagName, settings).equals(expected));
    }

}