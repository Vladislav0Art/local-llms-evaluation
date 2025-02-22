package ch.jalu.configme.configurationdata;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import ch.jalu.configme.exception.ConfigMeException;
import ch.jalu.configme.properties.Property;
import org.junit.Test;

public class GeneratedGivenProperty_whenAdd_thenPropertyAdded {

    private PropertyListBuilder propertyListBuilder = new PropertyListBuilder();

    @Test
    public void givenProperty_whenAdd_thenPropertyAdded() {
        Property<Integer> property = new Property<>("test.property", 42);

        propertyListBuilder.add(property);

        assertEquals(1, propertyListBuilder.getRootEntries().size());
        assertTrue(propertyListBuilder.getRootEntries().containsKey("test"));
        assertTrue(propertyListBuilder.getRootEntries().get("test") instanceof Map);
        assertTrue(((Map<?, ?>) propertyListBuilder.getRootEntries().get("test")).containsKey("property"));
        assertTrue(((Map<?, ?>) propertyListBuilder.getRootEntries().get("test")).get("property") instanceof Property);
        assertEquals(42, ((Property<Integer>) ((Map<?, ?>) propertyListBuilder.getRootEntries().get("test")).get("property")).getDefaultValue());
    }

}