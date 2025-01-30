package ch.jalu.configme.configurationdata;

import ch.jalu.configme.configurationdata.PropertyListBuilder;
import ch.jalu.configme.exception.ConfigMeException;
import ch.jalu.configme.properties.Property;
import ch.jalu.configme.properties.StringProperty;
import org.junit.Test;

import java.lang.reflect.Field;
import java.util.List;
import java.util.Map;

import static org.junit.Assert.*;

public class GeneratedCreatePropertyListTest {

    @Test
    public void createPropertyListTest() {
        PropertyListBuilder builder = new PropertyListBuilder();
        Property<String> property = new StringProperty("test.path", "default");
        builder.add(property);
        List<Property<?>> properties = builder.create();
        assertTrue(properties.contains(property));
    }

}