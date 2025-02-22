package ch.jalu.configme.configurationdata;

import ch.jalu.configme.exception.ConfigMeException;
import ch.jalu.configme.properties.Property;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;

public class GeneratedTestCreate {

    private PropertyListBuilder builder = new PropertyListBuilder();

    @Test
    public void testCreate() {
        Property<?> property = new Property<>("test", String.class);
        builder.add(property);
        List<Property<?>> properties = builder.create();
        assertEquals(1, properties.size());
        assertEquals(property, properties.get(0));
    }

}