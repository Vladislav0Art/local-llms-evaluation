package ch.jalu.configme.configurationdata;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class GeneratedTestCreate {

    @Test
    public void testCreate() {
        PropertyListBuilder propertyListBuilder = new PropertyListBuilder();
        Property<String> property = new Property<>("path", String.class, "value");
        propertyListBuilder.add(property);
        List<Property<?>> properties = propertyListBuilder.create();
        assertEquals(1, properties.size());
        assertEquals(property, properties.get(0));
    }

}