package org.jsoup.parser;

import org.jsoup.parser.Tag;
import org.junit.Test;

import java.util.Map;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

public class GeneratedValueOfWithoutSettingsTest {

    @Test
    public void valueOfWithoutSettingsTest() {
        Tag tag = new Tag();
        assertNull(tag.valueOf("tag"));
    }

}