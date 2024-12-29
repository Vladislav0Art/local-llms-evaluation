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

public class GeneratedPut {

    @Test
    public void put() {
        // Arrange
        Attributes attributes = new Attributes();
        String key = "test";
        boolean value = true;

        // Act
        Attributes result = attributes.put(key, value);

        // Assert
        assertNotNull(result);
        assertEquals(attributes, result);
        assertTrue(attributes.hasKey(key));
    }

}