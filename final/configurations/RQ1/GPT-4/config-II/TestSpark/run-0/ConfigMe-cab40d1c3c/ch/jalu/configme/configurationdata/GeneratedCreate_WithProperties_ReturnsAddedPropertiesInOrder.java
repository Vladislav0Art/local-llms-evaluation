package ch.jalu.configme.configurationdata;

import ch.jalu.configme.configurationdata.PropertyListBuilder;
import ch.jalu.configme.exception.ConfigMeException;
import ch.jalu.configme.properties.Property;
import org.junit.Test;

import java.util.List;
import java.util.Map;

import static org.junit.Assert.*;

public class GeneratedCreate_WithProperties_ReturnsAddedPropertiesInOrder {

    @Test
    public void create_WithProperties_ReturnsAddedPropertiesInOrder() {
        PropertyListBuilder builder = new PropertyListBuilder();
        Property<String> property1 = new Property<>(() -> "default", "path.to.value1");
        Property<String> property2 = new Property<>(() -> "default2", "path.to.value2");

        // Add properties, should not fail
        builder.add(property1);
        builder.add(property2);

        // create list
        List<Property<?>> properties = builder.create();

        // Asserts
        assertEquals(2, properties.size());
        assertEquals(property1, properties.get(0));
        assertEquals(property2, properties.get(1));
    }

}