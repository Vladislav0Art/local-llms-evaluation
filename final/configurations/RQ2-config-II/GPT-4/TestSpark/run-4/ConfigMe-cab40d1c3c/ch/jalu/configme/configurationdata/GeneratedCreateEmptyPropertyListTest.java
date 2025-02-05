package ch.jalu.configme.configurationdata;

import org.junit.Test;
import ch.jalu.configme.configurationdata.PropertyListBuilder;
import ch.jalu.configme.properties.Property;
import ch.jalu.configme.exception.ConfigMeException;

import java.util.List;

import static org.junit.Assert.*;

public class GeneratedCreateEmptyPropertyListTest {

    @Test
    public void createEmptyPropertyListTest() {
        PropertyListBuilder propertyListBuilder = new PropertyListBuilder();

        // Fetch the current property list, which should be empty as no properties have been added
        List<Property<?>> propertyList = propertyListBuilder.create();

        assertTrue("The property list should be empty", propertyList.isEmpty());
    }

}