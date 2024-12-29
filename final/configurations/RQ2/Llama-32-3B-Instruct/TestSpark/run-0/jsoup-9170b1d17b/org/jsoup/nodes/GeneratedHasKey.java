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

public class GeneratedHasKey {

    @Test
    public void hasKey() {
        // Arrange
        Attributes attributes = new Attributes();
        String key = "test";
        attributes.add(key, "");

        // Act
        boolean result = attributes.hasKey(key);

        // Assert
        assertTrue(result);
    }

}