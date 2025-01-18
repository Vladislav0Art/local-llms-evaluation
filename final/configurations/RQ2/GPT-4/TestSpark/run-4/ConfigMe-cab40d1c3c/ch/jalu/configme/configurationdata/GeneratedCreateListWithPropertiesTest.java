package ch.jalu.configme.configurationdata;

import ch.jalu.configme.configurationdata.PropertyListBuilder;
import ch.jalu.configme.exception.ConfigMeException;
import ch.jalu.configme.properties.Property;
import ch.jalu.configme.properties.StringProperty;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

public class GeneratedCreateListWithPropertiesTest {

    @Test
    public void createListWithPropertiesTest() {
        PropertyListBuilder propertyListBuilder = new PropertyListBuilder();
        Property<String> property1 = new StringProperty("path.to.property1", "default-value1");
        Property<String> property2 = new StringProperty("path.to.property2", "default-value2");
        propertyListBuilder.add(property1);
        propertyListBuilder.add(property2);
        List<Property<?>> properties = propertyListBuilder.create();
        assertEquals(2, properties.size());
        assertTrue(properties.contains(property1));
        assertTrue(properties.contains(property2));
    }

}