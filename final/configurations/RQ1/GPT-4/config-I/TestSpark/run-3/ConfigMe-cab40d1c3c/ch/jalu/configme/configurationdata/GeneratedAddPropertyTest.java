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

public class GeneratedAddPropertyTest {

    @Test
    public void addPropertyTest() {
        Property<String> propertyOne = new StringProperty("property.one", "default");
        Property<String> propertyTwo = new StringProperty("property.two", "default");

        PropertyListBuilder builder = new PropertyListBuilder();
        builder.add(propertyOne);
        builder.add(propertyTwo);

        Map<String, Object> rootEntries = builder.getRootEntries();
        assertEquals(1, rootEntries.size());
        assertTrue(rootEntries.get("property") instanceof Map);
    }

}