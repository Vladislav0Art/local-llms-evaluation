package ch.jalu.configme.configurationdata;

import ch.jalu.configme.exception.ConfigMeException;
import ch.jalu.configme.properties.Property;
import org.junit.Test;

import java.util.List;
import java.util.Map;

import static org.junit.Assert.assertNotSame;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class GeneratedAddPropertyTest {

    @Test
    public void addPropertyTest() {
        PropertyListBuilder builder = new PropertyListBuilder();
        Property<Object> property1 = new Property<Object>("path1", "defaultValue1");
        builder.add(property1);

        List<Property<?>> properties = builder.create();
        assertEquals("Should only have one property", 1, properties.size());
        assertEquals("Added property should be in properties", property1, properties.get(0));
    }

}