package ch.jalu.configme.configurationdata;

import ch.jalu.configme.configurationdata.PropertyListBuilder;
import ch.jalu.configme.exception.ConfigMeException;
import ch.jalu.configme.properties.Property;
import org.junit.Test;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

public class GeneratedTest {

    @Test
    public void addDuplicatePropertyTest() {
        Property<?> property = mock(Property.class);
        when(property.getPath()).thenReturn("DataSource.mysql");

        PropertyListBuilder propertyListBuilder = new PropertyListBuilder();
        propertyListBuilder.add(property);
        propertyListBuilder.add(property);
    }

    @Test
    public void addSinglePropertyTest() {
        Property<?> property = mock(Property.class);
        when(property.getPath()).thenReturn("DataSource.mysql");

        PropertyListBuilder propertyListBuilder = new PropertyListBuilder();
        propertyListBuilder.add(property);

        assertTrue(propertyListBuilder.getRootEntries().containsKey("DataSource"));
    }

    @Test
    public void addPropertyWithConflictingPathTest() {
        Property<?> property1 = mock(Property.class);
        when(property1.getPath()).thenReturn("DataSource.mysql");

        Property<?> property2 = mock(Property.class);
        when(property2.getPath()).thenReturn("DataSource");

        PropertyListBuilder propertyListBuilder = new PropertyListBuilder();
        propertyListBuilder.add(property1);
        propertyListBuilder.add(property2);
    }

    @Test
    public void createPropertyListTest() {
        Property<?> property1 = mock(Property.class);
        when(property1.getPath()).thenReturn("DataSource.mysql");

        Property<?> property2 = mock(Property.class);
        when(property2.getPath()).thenReturn("security");

        PropertyListBuilder propertyListBuilder = new PropertyListBuilder();
        propertyListBuilder.add(property1);
        propertyListBuilder.add(property2);

        assertEquals(2, propertyListBuilder.create().size());
    }

    @Test
    public void createEmptyPropertyListTest() {
        PropertyListBuilder propertyListBuilder = new PropertyListBuilder();
        assertTrue(propertyListBuilder.create().isEmpty());
    }

}