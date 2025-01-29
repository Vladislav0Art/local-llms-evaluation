package org.jsoup.parser;

import org.jsoup.parser.Tag;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.HashMap;
import java.util.Map;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedTestValueOfTagName {

    @Mock
    private Map<String, Boolean> selfClosingMap;

    @InjectMocks
    private Tag tag;

    public static String TAG_NAME = "div";

    @Test
    public void testValueOfTagName() {
        Tag value = Tag.valueOf("div");
        assertNotNull(value);
    }

}