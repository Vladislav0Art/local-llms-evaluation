package ch.jalu.configme.configurationdata;

import org.junit.Test;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

import org.mockito.Mockito;

public class GeneratedTest {

    @Test
    public void addPropertyTest() {
        PropertyListBuilder propertyListBuilder = new PropertyListBuilder();
        Property property = mock(Property.class);
        when(property.getPath()).thenReturn("DataSource.mysql");

        propertyListBuilder.add(property);

        assertEquals(propertyListBuilder.getRootEntries().get("DataSource").get("mysql"), property);
    }

    @Test
    public void addPropertyAlreadyExistsTest() {
        PropertyListBuilder propertyListBuilder = new PropertyListBuilder();
        Property property = new Property("DataSource.mysql", String.class);

        propertyListBuilder.add(property);
        propertyListBuilder.add(property);
    }

    @Test
    public void addPropertyWithInvalidPathTest() {
        PropertyListBuilder propertyListBuilder = new PropertyListBuilder();
        Property property = new Property("DataSource.mysql", String.class);

        propertyListBuilder.add(property);

        Property anotherProperty = new Property("DataSource", String.class);
        propertyListBuilder.add(anotherProperty);
    }

    @Test
    public void createTest() {
        PropertyListBuilder propertyListBuilder = new PropertyListBuilder();
        Property property = new Property("DataSource.mysql", String.class);

        propertyListBuilder.add(property);

        List<Property<?>> properties = propertyListBuilder.create();
        assertEquals(properties.size(), 1);
        assertEquals(properties.get(0), property);
    }

}