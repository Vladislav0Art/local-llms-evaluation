package ch.jalu.configme.configurationdata;

import ch.jalu.configme.exception.ConfigMeException;
import ch.jalu.configme.properties.Property;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;

public class GeneratedTestAddNested {

    private PropertyListBuilder builder = new PropertyListBuilder();

    @Test
    public void testAddNested() {
        Property<?> property = new Property<>("test.nested", String.class);
        builder.add(property);
        assertEquals(property, builder.getRootEntries().get("test").get("nested"));
    }

}