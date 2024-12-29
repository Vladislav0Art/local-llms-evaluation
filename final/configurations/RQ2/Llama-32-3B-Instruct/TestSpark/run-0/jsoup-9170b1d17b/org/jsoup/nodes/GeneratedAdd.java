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

public class GeneratedAdd {

    public static class MockParserTestUtils {
        public Document createDocument(ParseSettings settings) {
            return null;
        }
    }

    @Test
    public void add() {
        // Arrange and Act
        Attributes attributes = new Attributes();
        String key = "test";
        String value = "value";

        attributes.add(key, value);

        // Assert
        assertEquals(1, attributes.size());
        assertEquals(value, attributes.get(key));
    }

}