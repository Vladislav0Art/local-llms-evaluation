package ch.jalu.configme.configurationdata;

import org.junit.Test;

import static org.junit.Assert.*;

import org.mockito.Mockito;

public class GeneratedCreate_BuilderIncludesAddedProperties {

    @Test
    public void create_BuilderIncludesAddedProperties() {
        // Given
        Property<?> property1 = Mockito.mock(Property.class);
        Property<?> property2 = Mockito.mock(Property.class);
        List<Property<?>> properties = new ArrayList<>();
        Mockito.when(property1.getClass()).thenReturn(Property.class);
        Mockito.when(property2.getClass()).thenReturn(Property.class);

        // When
        new PropertyListBuilder().add(property1).add(property2);

        // Then
        assertTrue(properties.contains(property1));
        assertTrue(properties.contains(property2));
    }

}