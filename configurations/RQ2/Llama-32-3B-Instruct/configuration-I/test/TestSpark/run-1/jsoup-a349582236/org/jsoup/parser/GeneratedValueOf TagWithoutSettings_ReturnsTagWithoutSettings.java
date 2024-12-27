package org.jsoup.parser;

import org.jsoup.parser.Tag;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedValueOf TagWithoutSettings_ReturnsTagWithoutSettings {

    @Mock
    private ParseSettings settings;

    @Test
    public void valueOf

    TagWithoutSettings_ReturnsTagWithoutSettings() {
        String tagName = "tag";
        Tag expected = new Tag();
        org.junit.Assert.assertTrue(Tag.valueOf(tagName).equals(expected));
    }

}