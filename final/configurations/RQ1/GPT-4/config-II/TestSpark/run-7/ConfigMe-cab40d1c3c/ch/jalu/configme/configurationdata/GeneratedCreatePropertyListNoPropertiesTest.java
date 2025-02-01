package ch.jalu.configme.configurationdata;

import ch.jalu.configme.configurationdata.PropertyListBuilder;
import ch.jalu.configme.exception.ConfigMeException;
import ch.jalu.configme.properties.Property;
import org.junit.Test;

import java.util.List;
import java.util.Map;

import static org.junit.Assert.*;

public class GeneratedCreatePropertyListNoPropertiesTest {

    @Test
    public void createPropertyListNoPropertiesTest() {
        PropertyListBuilder propertyListBuilder = new PropertyListBuilder();

        List<Property<?>> createdProperties = propertyListBuilder.create();
        assertTrue(createdProperties.isEmpty());
    }

    private static class TypicalProperty implements Property<String> {
        @Override
        public String getPath() {
            return "test_property";
        }

        @Override
        public String getDefaultValue() {
            return "default_value";
        }
    }

}