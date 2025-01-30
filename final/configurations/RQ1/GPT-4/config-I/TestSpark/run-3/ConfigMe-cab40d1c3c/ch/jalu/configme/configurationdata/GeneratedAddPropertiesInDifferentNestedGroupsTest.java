package ch.jalu.configme.configurationdata;

import ch.jalu.configme.exception.ConfigMeException;
import ch.jalu.configme.properties.Property;
import org.junit.Test;

import java.util.List;
import java.util.Map;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

public class GeneratedAddPropertiesInDifferentNestedGroupsTest {

    @Test
    public void addPropertiesInDifferentNestedGroupsTest() {
        Property<String> propertyOne = new Property<>("property.one", "default");
        Property<String> propertyNested = new Property<>("propertyNested.value", "default");

        PropertyListBuilder builder = new PropertyListBuilder();
        builder.add(propertyOne);
        builder.add(propertyNested);

        List<Property<?>> properties = builder.create();
        assertEquals(2, properties.size());
        assertEquals("property.one", properties.get(0).getPath());
        assertEquals("propertyNested.value", properties.get(1).getPath());
    }

}