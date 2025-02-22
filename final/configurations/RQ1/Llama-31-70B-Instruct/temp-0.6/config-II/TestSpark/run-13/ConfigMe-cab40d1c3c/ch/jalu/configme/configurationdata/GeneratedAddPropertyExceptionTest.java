package ch.jalu.configme.configurationdata;

import org.junit.Test;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

public class GeneratedAddPropertyExceptionTest {

    @Test
    public void addPropertyExceptionTest() {
        PropertyListBuilder propertyListBuilder = new PropertyListBuilder();
        Property<?> property = mock(Property.class);
        when(property.getPath()).thenReturn("test");

        propertyListBuilder.add(property);
        propertyListBuilder.add(property);
    }

}