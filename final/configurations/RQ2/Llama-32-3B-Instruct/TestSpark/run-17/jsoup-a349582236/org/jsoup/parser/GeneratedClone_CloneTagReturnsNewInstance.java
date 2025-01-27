package org.jsoup.parser;

import org.jsoup.helper.Validate;
import org.jsoup.internal.Normalizer;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.*;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedClone_CloneTagReturnsNewInstance {

    @Mock
    private ParseSettings parseSettings;

    @Test
    public void clone_CloneTagReturnsNewInstance() {
        // Arrange
        Tag tag = new Tag();

        // Act and Assert
        Tag clonedTag = tag.clone();
        assertNotSame(tag, clonedTag);
    }

}