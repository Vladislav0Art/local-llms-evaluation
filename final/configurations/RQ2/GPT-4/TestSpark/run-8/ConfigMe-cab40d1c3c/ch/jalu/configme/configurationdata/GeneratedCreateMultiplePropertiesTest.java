package ch.jalu.configme.configurationdata;

import ch.jalu.configme.exception.ConfigMeException;
import ch.jalu.configme.properties.Property;
import org.junit.Test;
import org.mockito.Mockito;

import java.util.*;

import static org.junit.Assert.*;

public class GeneratedCreateMultiplePropertiesTest {

    @Test
    public void createMultiplePropertiesTest() {
        PropertyListBuilder propertyListBuilder = new PropertyListBuilder();

        Property<?> mockProperty1 = Mockito.mock(Property.class);
        Mockito.when(mockProperty1.getPath()).thenReturn("test.path1");

        Property<?> mockProperty2 = Mockito.mock(Property.class);
        Mockito.when(mockProperty2.getPath()).thenReturn("test.path2");

        propertyListBuilder.add(mockProperty1);
        propertyListBuilder.add(mockProperty2);

        List<Property<?>> propertyList = propertyListBuilder.create();

        assertEquals(2, propertyList.size());
        assertEquals("test.path1", propertyList.get(0).getPath());
        assertEquals("test.path2", propertyList.get(1).getPath());
    }

}