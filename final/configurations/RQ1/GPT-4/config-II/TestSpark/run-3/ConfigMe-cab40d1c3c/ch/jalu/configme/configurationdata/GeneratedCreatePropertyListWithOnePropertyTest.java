package ch.jalu.configme.configurationdata;

import ch.jalu.configme.exception.ConfigMeException;
import ch.jalu.configme.properties.Property;
import org.junit.Test;

import java.util.List;
import java.util.Map;

import static org.junit.Assert.*;

public class GeneratedCreatePropertyListWithOnePropertyTest {

    @Test
    public void createPropertyListWithOnePropertyTest() {
        PropertyListBuilder builder = new PropertyListBuilder();
        Property<String> property = new Property<>("my.test.property", "default");
        builder.add(property);
        List<Property<?>> properties = builder.create();
        assertEquals(1, properties.size());
        assertSame(property, properties.get(0));
    }

}