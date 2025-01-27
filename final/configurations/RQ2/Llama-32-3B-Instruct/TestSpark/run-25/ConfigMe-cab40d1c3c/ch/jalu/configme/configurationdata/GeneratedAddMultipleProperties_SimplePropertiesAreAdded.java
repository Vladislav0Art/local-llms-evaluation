package ch.jalu.configme.configurationdata;

import org.junit.Test;

import static org.junit.Assert.*;

import org.mockito.Mockito;

public class GeneratedAddMultipleProperties_SimplePropertiesAreAdded {

    @Test
    public void addMultipleProperties_SimplePropertiesAreAdded() {
        // Given
        Property<?> property1 = Mockito.mock(Property.class);
        Property<?> property2 = Mockito.mock(Property.class);
        List<Property<?>> properties = new ArrayList<>();
        Mockito.when(property1.getClass()).thenReturn(Property.class);
        Mockito.when(property2.getClass()).thenReturn(Property.class);

        // When
        new PropertyListBuilder().add(property1).add(property2);

        // Then
        assertEquals(2, properties.size());
    }

}