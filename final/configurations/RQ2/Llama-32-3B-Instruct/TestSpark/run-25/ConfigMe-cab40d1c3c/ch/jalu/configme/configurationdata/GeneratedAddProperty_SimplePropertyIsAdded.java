package ch.jalu.configme.configurationdata;

import org.junit.Test;

import static org.junit.Assert.*;

import org.mockito.Mockito;

public class GeneratedAddProperty_SimplePropertyIsAdded {

    @Test
    public void addProperty_SimplePropertyIsAdded() {
        // Given
        Property<?> property = Mockito.mock(Property.class);
        List<Property<?>> properties = new ArrayList<>();
        Mockito.when(property.getClass()).thenReturn(Property.class);

        // When
        new PropertyListBuilder().add(property);

        // Then
        assertEquals(1, properties.size());
    }

}