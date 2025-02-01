package ch.jalu.configme.configurationdata;

import ch.jalu.configme.exception.ConfigMeException;
import ch.jalu.configme.properties.Property;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class GeneratedAddPropertyAlreadyExistsTest {

    @Test
    public void addPropertyAlreadyExistsTest() {
        // Given
        Property<?> mockProperty = Mockito.mock(Property.class);
        Mockito.when(mockProperty.getPath()).thenReturn("DataSource.mysql");
        PropertyListBuilder propertyListBuilder = new PropertyListBuilder();

        // When
        propertyListBuilder.add(mockProperty); // Initial adding
        propertyListBuilder.add(mockProperty); // Adding again to get Exception.
    }

}