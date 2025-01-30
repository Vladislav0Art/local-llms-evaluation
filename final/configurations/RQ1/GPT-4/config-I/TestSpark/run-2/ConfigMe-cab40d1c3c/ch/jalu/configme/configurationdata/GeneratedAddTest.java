package ch.jalu.configme.configurationdata;

import ch.jalu.configme.exception.ConfigMeException;
import ch.jalu.configme.properties.Property;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

public class GeneratedAddTest {

    @Test
    public void addTest() {
        PropertyListBuilder builder = new PropertyListBuilder();

        Property<?> property1 = new SimpleTestProperty("property1", "default1");
        Property<?> property2 = new SimpleTestProperty("property2", "default2");
        Property<?> property3 = new SimpleTestProperty("property3", "default3");

        builder.add(property1);
        builder.add(property2);
        builder.add(property3);

        List<Property<?>> result = builder.create();

        assertEquals(3, result.size());
        assertEquals("property1", result.get(0).getPath());
        assertEquals("property2", result.get(1).getPath());
        assertEquals("property3", result.get(2).getPath());
    }

}