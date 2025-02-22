package ch.jalu.configme.configurationdata;

import org.junit.Test;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

public class GeneratedTest {

    @Test
    public void addPropertyTest() {
        PropertyListBuilder propertyListBuilder = new PropertyListBuilder();
        Property<?> property = mock(Property.class);
        when(property.getPath()).thenReturn("test");

        propertyListBuilder.add(property);

        assertTrue(propertyListBuilder.getRootEntries().containsKey("test"));
    }

    @Test
    public void addPropertyExceptionTest() {
        PropertyListBuilder propertyListBuilder = new PropertyListBuilder();
        Property<?> property = mock(Property.class);
        when(property.getPath()).thenReturn("test");

        propertyListBuilder.add(property);
        propertyListBuilder.add(property);
    }

    @Test
    public void createTest() {
        PropertyListBuilder propertyListBuilder = new PropertyListBuilder();
        Property<?> property = mock(Property.class);
        when(property.getPath()).thenReturn("test");

        propertyListBuilder.add(property);
        List<Property<?>> result = propertyListBuilder.create();

        assertEquals(1, result.size());
        assertEquals(property, result.get(0));
    }

}