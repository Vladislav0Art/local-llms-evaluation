package org.jsoup.parser;

import org.jsoup.parser.XmlTreeBuilder;
import org.junit.Test;

import static org.junit.Assert.*;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class GeneratedDefaultSettings_returnsDefaultSettings {

    @Test
    public void defaultSettings_returnsDefaultSettings() {
        ParseSettings settings = new XmlTreeBuilder().defaultSettings();
        assertNotNull(settings);
    }

}