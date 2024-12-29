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

public class GeneratedRemove {

    @Test
    public void remove() {
        // Arrange
        Attributes attributes = new Attributes();
        String key = "test";
        attributes.add(key, "");

        // Act
        attributes.remove(key);

        // Assert
        assertFalse(attributes.hasKey(key));
        assertEquals(0, attributes.size());
    }

}