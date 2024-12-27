package org.jsoup.parser;

import org.jsoup.parser.HtmlTreeBuilder;
import org.jsoup.parser.ParserSettings;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.Mockito;

public class GeneratedDefaultSettingsReturnsDefaultParseSettings {

    private HtmlTreeBuilder htmlTreeBuilder;

    @Before
    public void setUp() {
        htmlTreeBuilder = new HtmlTreeBuilder();
    }

    @Test
    public void defaultSettingsReturnsDefaultParseSettings() {
        // Arrange
        ParserSettings settings = Mockito.mock(ParserSettings.class);

        // Act
        htmlTreeBuilder.defaultSettings();

        // Assert
        Mockito.verify(settings).setAllowTags(null);
        Mockito.verify(settings).setAllowEntities(null);
        Mockito.verify(settings).setAllowComments(null);
    }

}