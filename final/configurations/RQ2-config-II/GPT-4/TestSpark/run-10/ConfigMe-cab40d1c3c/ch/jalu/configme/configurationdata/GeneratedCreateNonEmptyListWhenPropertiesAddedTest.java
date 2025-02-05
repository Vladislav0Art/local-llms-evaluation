package ch.jalu.configme.configurationdata;

import ch.jalu.configme.exception.ConfigMeException;
import ch.jalu.configme.properties.Property;
import org.junit.Test;
import org.mockito.Mockito;

import java.util.List;
import java.util.Map;

import static org.junit.Assert.*;

public class GeneratedCreateNonEmptyListWhenPropertiesAddedTest {

    @Test
    public void createNonEmptyListWhenPropertiesAddedTest() {
        Property<Object> mockProperty = Mockito.mock(Property.class);
        Mockito.when(mockProperty.getPath()).thenReturn("test.path");

        PropertyListBuilder propertyListBuilder = new PropertyListBuilder();
        propertyListBuilder.add(mockProperty);

        List<Property<?>> propertyList = propertyListBuilder.create();
        assertFalse(propertyList.isEmpty());
    }

}