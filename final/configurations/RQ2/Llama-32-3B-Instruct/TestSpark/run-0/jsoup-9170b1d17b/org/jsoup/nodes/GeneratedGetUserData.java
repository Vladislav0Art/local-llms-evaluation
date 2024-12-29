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

public class GeneratedGetUserData {

    public static class MockParserTestUtils {
        public Document createDocument(ParseSettings settings) {
            return null;
        }
    }

    @Test
    public void getUserData() {
        // Arrange
        Attributes attributes = new Attributes();
        String key = "test";
        Object value = "value";

        // Act
        Object result = attributes.getUserData(key);

        // Assert
        assertEquals(value, result);
    }

}