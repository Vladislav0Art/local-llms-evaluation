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

public class GeneratedPutAttribute {

    @Test
    public void putAttribute() {
        // Arrange
        Attributes attributes = new Attributes();

        // Act
        Attributes result = attributes.put(new Attribute("test", "value"));

        // Assert
        assertNotNull(result);
        assertEquals(attributes, result);
    }

}