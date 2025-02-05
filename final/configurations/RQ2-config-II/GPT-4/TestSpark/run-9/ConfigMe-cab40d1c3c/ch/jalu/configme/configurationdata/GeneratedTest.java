package ch.jalu.configme.configurationdata;

import ch.jalu.configme.properties.Property;
import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

import java.util.List;

public class GeneratedTest {

    @Test
    public void addPropertyTest() {
        // Given
        PropertyListBuilder propertyListBuilder = new PropertyListBuilder();
        Property<String> mockProperty = Mockito.mock(Property.class);

        // When
        propertyListBuilder.add(mockProperty);
        List<Property<?>> results = propertyListBuilder.create();

        // Then
        Assert.assertEquals(1, results.size());
        Assert.assertSame(mockProperty, results.get(0));
    }

    @Test
    public void addNullPropertyTest() {
        // Given
        PropertyListBuilder propertyListBuilder = new PropertyListBuilder();

        // When
        propertyListBuilder.add(null);
    }

    @Test
    public void createEmptyListTest() {
        // Given
        PropertyListBuilder propertyListBuilder = new PropertyListBuilder();

        // When
        List<Property<?>> results = propertyListBuilder.create();

        // Then
        Assert.assertTrue(results.isEmpty());
    }

    @Test
    public void getRootEntriesTest() {
        // Given
        PropertyListBuilder propertyListBuilder = new PropertyListBuilder();

        // When
        propertyListBuilder.add(Mockito.mock(Property.class));
        propertyListBuilder.add(Mockito.mock(Property.class));

        // Then
        Assert.assertFalse(propertyListBuilder.getRootEntries().isEmpty());
        Assert.assertEquals(2, propertyListBuilder.getRootEntries().size());
    }

    @Test
    public void getRootEntriesEmptyTest() {
        // Given
        PropertyListBuilder propertyListBuilder = new PropertyListBuilder();

        // Then
        Assert.assertTrue(propertyListBuilder.getRootEntries().isEmpty());
    }

}