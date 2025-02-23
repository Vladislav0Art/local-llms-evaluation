package ch.jalu.configme.configurationdata;

import org.junit.Test;
import org.mockito.Mockito;

import static org.junit.Assert.*;

public class GeneratedAddProperty_createsNewEntry {

    @Test
    public void addProperty_createsNewEntry() {
        // Arrange
        PropertyListBuilder propertyListBuilder = new PropertyListBuilder();
        Property<?> property = Mockito.mock(Property.class);
        Mockito.when(property.getPath()).thenReturn("some.path");

        // Act
        propertyListBuilder.add(property);

        // Assert
        assertEquals(property, propertyListBuilder.getRootEntries().get("some").get("path"));
    }

}