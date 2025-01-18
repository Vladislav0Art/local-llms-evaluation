package ch.jalu.configme.configurationdata;

import ch.jalu.configme.exception.ConfigMeException;
import ch.jalu.configme.properties.Property;
import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

public class GeneratedTest {

    @Test
    public void addTest() {
        PropertyListBuilder propertyListBuilder = new PropertyListBuilder();
        Property mockProperty = Mockito.mock(Property.class);
        Mockito.when(mockProperty.getPath()).thenReturn("property.path");

        propertyListBuilder.add(mockProperty);
        Assert.assertFalse(propertyListBuilder.create().isEmpty());
    }

    @Test
    public void addNullPropertyTest() {
        PropertyListBuilder propertyListBuilder = new PropertyListBuilder();
        propertyListBuilder.add(null);
    }

    @Test
    public void createEmptyTest() {
        PropertyListBuilder propertyListBuilder = new PropertyListBuilder();
        Assert.assertTrue(propertyListBuilder.create().isEmpty());
    }

    @Test
    public void getRootEntriesEmptyTest() {
        PropertyListBuilder propertyListBuilder = new PropertyListBuilder();
        Assert.assertTrue(propertyListBuilder.getRootEntries().isEmpty());
    }

    @Test
    public void getRootEntriesNonEmptyTest() {
        PropertyListBuilder propertyListBuilder = new PropertyListBuilder();
        Property mockProperty = Mockito.mock(Property.class);
        Mockito.when(mockProperty.getPath()).thenReturn("property.path");

        propertyListBuilder.add(mockProperty);
        Assert.assertFalse(propertyListBuilder.getRootEntries().isEmpty());
    }

}