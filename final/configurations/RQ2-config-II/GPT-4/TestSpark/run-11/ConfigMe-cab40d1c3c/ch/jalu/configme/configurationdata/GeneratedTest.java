package ch.jalu.configme.configurationdata;

import ch.jalu.configme.exception.ConfigMeException;
import ch.jalu.configme.properties.Property;
import ch.jalu.configme.configurationdata.PropertyListBuilder;
import org.junit.Test;
import org.junit.Assert;

import java.util.List;
import java.util.Map;

import org.mockito.Mockito;

public class GeneratedTest {

    @Test
    public void addValidPropertyTest() {
        // Given
        PropertyListBuilder builder = new PropertyListBuilder();
        Property mockProperty = Mockito.mock(Property.class);

        // When
        builder.add(mockProperty);

        // Then no exception should be thrown
    }

    @Test
    public void addNullPropertyTest() {
        // Given
        PropertyListBuilder builder = new PropertyListBuilder();

        // When
        builder.add(null);

        // Then ConfigMeException should be thrown
    }

    @Test
    public void createEmptyBuilderTest() {
        // Given
        PropertyListBuilder builder = new PropertyListBuilder();

        // When
        List<Property<?>> properties = builder.create();

        // Then
        Assert.assertTrue(properties.isEmpty());
    }

    @Test
    public void createNonEmptyBuilderTest() {
        // Given
        PropertyListBuilder builder = new PropertyListBuilder();
        Property mockProperty = Mockito.mock(Property.class);

        // When
        builder.add(mockProperty);
        List<Property<?>> properties = builder.create();

        // Then
        Assert.assertFalse(properties.isEmpty());
        Assert.assertEquals(mockProperty, properties.get(0));
    }

    @Test
    public void getRootEntriesEmptyBuilderTest() {
        // Given
        PropertyListBuilder builder = new PropertyListBuilder();

        // When
        Map<String, Object> entries = builder.getRootEntries();

        // Then
        Assert.assertTrue(entries.isEmpty());
    }

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