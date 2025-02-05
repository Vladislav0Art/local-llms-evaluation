package ch.jalu.configme.configurationdata;

import ch.jalu.configme.exception.ConfigMeException;
import ch.jalu.configme.properties.Property;
import org.junit.Test;
import org.mockito.Mockito;

import java.util.List;
import java.util.Map;

import static org.junit.Assert.*;

public class GeneratedAddPropertyWithDuplicatePathFailsTest {

    @Test
    public void addPropertyWithDuplicatePathFailsTest() {
        Property<Object> mockProperty1 = Mockito.mock(Property.class);
        Mockito.when(mockProperty1.getPath()).thenReturn("test.path");

        Property<Object> mockProperty2 = Mockito.mock(Property.class);
        Mockito.when(mockProperty2.getPath()).thenReturn("test.path");

        PropertyListBuilder propertyListBuilder = new PropertyListBuilder();
        propertyListBuilder.add(mockProperty1);
        propertyListBuilder.add(mockProperty2);
    }

}