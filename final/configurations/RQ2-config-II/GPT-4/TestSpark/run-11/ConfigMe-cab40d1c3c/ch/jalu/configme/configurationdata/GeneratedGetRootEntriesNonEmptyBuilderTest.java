package ch.jalu.configme.configurationdata;

import ch.jalu.configme.exception.ConfigMeException;
import ch.jalu.configme.properties.Property;
import ch.jalu.configme.configurationdata.PropertyListBuilder;
import org.junit.Test;
import org.junit.Assert;

import java.util.List;
import java.util.Map;

import org.mockito.Mockito;

public class GeneratedGetRootEntriesNonEmptyBuilderTest {

    @Test
    public void getRootEntriesNonEmptyBuilderTest() {
        // Given
        PropertyListBuilder builder = new PropertyListBuilder();
        Property mockProperty = Mockito.mock(Property.class);
        Mockito.when(mockProperty.getPath()).thenReturn("test.path");

        // When
        builder.add(mockProperty);
        Map<String, Object> entries = builder.getRootEntries();

        // Then
        Assert.assertFalse(entries.isEmpty());
        Assert.assertTrue(entries.containsKey("test.path"));
    }

}