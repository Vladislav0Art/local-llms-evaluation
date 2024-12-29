package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import static org.mockito.Mockito.*;

import org.jsoup.ParserTestUtils;
import org.jsoup.SerializationException;
import org.jsoup.helper.Validate;
import org.jsoup.internal.StringUtil;
import org.jsoup.parser.ParseSettings;

import javax.annotation.Nullable;

public class GeneratedGetIgnoreCase {

    @Test
    public void getIgnoreCase() {
        // Arrange
        Attributes attributes = new Attributes();
        String key = "test";
        String value = "value";

        // Act
        String result = attributes.getIgnoreCase(key);

        // Assert
        assertEquals(value, result);
    }

}