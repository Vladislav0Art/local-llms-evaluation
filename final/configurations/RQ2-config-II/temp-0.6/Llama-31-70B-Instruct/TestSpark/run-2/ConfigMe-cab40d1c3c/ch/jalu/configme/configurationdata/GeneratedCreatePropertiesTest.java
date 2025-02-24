package ch.jalu.configme.configurationdata;

import ch.jalu.configme.exception.ConfigMeException;
import ch.jalu.configme.properties.Property;
import org.junit.Test;
import org.mockito.Mockito;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class GeneratedCreatePropertiesTest {

    @Test
    public void createPropertiesTest() {
        PropertyListBuilder propertyListBuilder = new PropertyListBuilder();
        Property<String> mockProperty = Mockito.mock(Property.class);
        propertyListBuilder.add(mockProperty);
        List<Property<?>> properties = propertyListBuilder.create();
        assert (properties.size() == 1);
    }

}