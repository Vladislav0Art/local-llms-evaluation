package ch.jalu.configme.configurationdata;

import ch.jalu.configme.exception.ConfigMeException;
import ch.jalu.configme.properties.Property;
import org.junit.Test;
import org.mockito.Mockito;

import java.util.*;

import static org.junit.Assert.*;

public class GeneratedAddPropertyDuplicateTest {

    @Test
    public void addPropertyDuplicateTest() {
        PropertyListBuilder propertyListBuilder = new PropertyListBuilder();

        Property<?> mockProperty = Mockito.mock(Property.class);
        Mockito.when(mockProperty.getPath()).thenReturn("test.path");

        propertyListBuilder.add(mockProperty);
        propertyListBuilder.add(mockProperty); // throws exception
    }

}