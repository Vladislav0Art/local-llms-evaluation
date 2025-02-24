package ch.jalu.configme.configurationdata;

import ch.jalu.configme.properties.Property;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class GeneratedCreateTest_PropertiesExist_ExpectListCreated {

    private PropertyListBuilder propertyListBuilder;

    @Before
    public void setUp() {
        propertyListBuilder = new PropertyListBuilder();
    }

    @Test
    public void createTest_PropertiesExist_ExpectListCreated() {
        Property<?> property = Mockito.mock(Property.class);
        propertyListBuilder.add(property);
        List<Property<?>> propertyList = propertyListBuilder.create();
        assertEquals(1, propertyList.size());
    }

}