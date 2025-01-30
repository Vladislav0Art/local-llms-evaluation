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

public class GeneratedAddPropertyToDifferentNestedGroupsTest {

    @Test
    public void addPropertyToDifferentNestedGroupsTest() {
        Property<String> propertyOne = new StringProperty("property.one", "default");
        Property<String> propertyNested = new StringProperty("propertyNested.value", "default");

        PropertyListBuilder builder = new PropertyListBuilder();
        builder.add(propertyOne);
        builder.add(propertyNested);

        List<Property<?>> properties = builder.create();
        assertEquals(2, properties.size());
        assertEquals("property.one", properties.get(0).getPath());
        assertEquals("propertyNested.value", properties.get(1).getPath());
    }

}