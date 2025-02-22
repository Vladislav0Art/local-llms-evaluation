package ch.jalu.configme.configurationdata;

import ch.jalu.configme.exception.ConfigMeException;
import ch.jalu.configme.properties.Property;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;

public class GeneratedTestAdd {

    private PropertyListBuilder builder = new PropertyListBuilder();

    @Test
    public void testAdd() {
        Property<?> property = new Property<>("test", String.class);
        builder.add(property);
        assertEquals(property, builder.getRootEntries().get("test"));
    }

}