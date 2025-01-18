package ch.jalu.configme.configurationdata;

import ch.jalu.configme.configurationdata.PropertyListBuilder;
import ch.jalu.configme.properties.Property;
import ch.jalu.configme.properties.StringProperty;
import ch.jalu.configme.exception.ConfigMeException;
import org.junit.Test;

import java.util.List;
import java.util.Map;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

public class GeneratedAddNewPropertyToBuilderTest {

    @Test
    public void addNewPropertyToBuilderTest() {
        PropertyListBuilder propertyListBuilder = new PropertyListBuilder();
        Property<String> testProperty = new StringProperty("testPropertyPath", "defaultValue");
        propertyListBuilder.add(testProperty);
        List<Property<?>> properties = propertyListBuilder.create();
        assertTrue("Property list size should be 1.", properties.size() == 1);
        assertEquals("Property is different.", testProperty, properties.get(0));
    }

}