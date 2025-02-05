package ch.jalu.configme.configurationdata;

import org.junit.Test;
import ch.jalu.configme.configurationdata.PropertyListBuilder;
import ch.jalu.configme.properties.Property;
import ch.jalu.configme.exception.ConfigMeException;

import java.util.List;

import static org.junit.Assert.*;

public class GeneratedAddValidPropertyTest {

    @Test
    public void addValidPropertyTest() {
        PropertyListBuilder propertyListBuilder = new PropertyListBuilder();
        Property<?> property = new Property<String>("sample.path", "default value");

        // Add a valid property, which should not throw an exception
        propertyListBuilder.add(property);

        // Fetch the current property list to confirm it has been added
        List<Property<?>> propertyList = propertyListBuilder.create();

        assertTrue("The property list should contain the added property", propertyList.contains(property));
    }

}