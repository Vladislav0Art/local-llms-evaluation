package ch.jalu.configme.configurationdata;

import ch.jalu.configme.exception.ConfigMeException;
import ch.jalu.configme.properties.Property;
import ch.jalu.configme.properties.StringProperty;
import org.junit.Test;

import java.util.List;
import java.util.Map;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

public class GeneratedCreateNestedPropertyListTest {

    @Test
    public void createNestedPropertyListTest() {
        Property<String> propertyOne = new StringProperty("property.one", "default");
        Property<String> propertyTwo = new StringProperty("property.two", "default");

        PropertyListBuilder builder = new PropertyListBuilder();
        builder.add(propertyOne);
        builder.add(propertyTwo);

        List<Property<?>> properties = builder.create();
        assertEquals(2, properties.size());
        assertEquals("property.one", properties.get(0).getPath());
        assertEquals("property.two", properties.get(1).getPath());
    }

}