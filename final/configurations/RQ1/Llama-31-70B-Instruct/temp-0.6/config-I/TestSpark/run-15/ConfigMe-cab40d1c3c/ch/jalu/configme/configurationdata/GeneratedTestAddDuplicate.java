package ch.jalu.configme.configurationdata;

import ch.jalu.configme.exception.ConfigMeException;
import ch.jalu.configme.properties.Property;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;

public class GeneratedTestAddDuplicate {

    private PropertyListBuilder builder = new PropertyListBuilder();

    @Test
    public void testAddDuplicate() {
        Property<?> property = new Property<>("test", String.class);
        builder.add(property);
        assertThrows(ConfigMeException.class, () -> builder.add(property));
    }

}