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

public class GeneratedClone {

    @Test
    public void clone() {
        // Arrange
        Attributes attributes = new Attributes();

        // Act
        Attributes result = attributes.clone();

        // Assert
        assertNotNull(result);
        assertEquals(attributes, result);
    }
}

class Attribute {
    private String name;
    private String value;

    public Attribute(String name, String value) {
        this.name = name;
        this.value = value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Attribute)) return false;
        Attribute attribute = (Attribute) o;
        return StringUtil.equals(name, attribute.name) &&
                StringUtil.equals(value, attribute.value);
    }

    @Override
    public int hashCode() {
        return name.hashCode();
    }

}