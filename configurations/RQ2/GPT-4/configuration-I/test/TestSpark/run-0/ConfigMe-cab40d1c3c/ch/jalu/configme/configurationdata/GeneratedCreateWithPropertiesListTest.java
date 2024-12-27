package ch.jalu.configme.configurationdata;

import ch.jalu.configme.properties.Property;
import ch.jalu.configme.properties.StringProperty;
import org.junit.Test;

import java.util.List;
import java.util.Map;

import static org.junit.Assert.*;

import org.mockito.Mockito;

public class GeneratedCreateWithPropertiesListTest {

    @Test
    public void createWithPropertiesListTest() {
        PropertyListBuilder propertyListBuilder = new PropertyListBuilder();
        Property<String> prop = new StringProperty("SomePath", "DefaultValue");
        propertyListBuilder.add(prop);
        List<Property<?>> resultList = propertyListBuilder.create();
        assertFalse(resultList.isEmpty());
        assertEquals(prop, resultList.get(0));
    }

}