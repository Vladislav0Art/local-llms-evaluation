package org.jsoup.parser;

import org.junit.Test;
import org.jsoup.helper.Validate;
import org.jsoup.internal.Normalizer;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

import java.util.HashMap;
import java.util.Map;

public class GeneratedClone_ReturnsNewTag {

    @Test
    public void clone_ReturnsNewTag() {
        // Arrange and Act
        Tag tag = new Tag("test");
        Tag clonedTag = (Tag) tag.clone();

        // Assert
        assertNotNull(clonedTag);
        assertEquals(tag, clonedTag);
    }

}