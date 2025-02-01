package ch.jalu.configme.configurationdata;

import ch.jalu.configme.configurationdata.PropertyListBuilder;
import ch.jalu.configme.exception.ConfigMeException;
import ch.jalu.configme.properties.Property;
import org.junit.Test;

import java.util.List;
import java.util.Map;

import static org.junit.Assert.*;

public class GeneratedCreatePropertyListTest {

    @Test
    public void createPropertyListTest() {
        PropertyListBuilder propertyListBuilder = new PropertyListBuilder();
        Property<String> property = new TypicalProperty();
        propertyListBuilder.add(property);

        List<Property<?>> createdProperties = propertyListBuilder.create();
        assertEquals(1, createdProperties.size());
        assertEquals(property, createdProperties.get(0));
    }

}