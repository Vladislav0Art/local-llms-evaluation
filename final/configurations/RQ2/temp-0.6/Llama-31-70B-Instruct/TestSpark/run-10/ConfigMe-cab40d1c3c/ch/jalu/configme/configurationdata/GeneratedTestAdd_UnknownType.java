package ch.jalu.configme.configurationdata;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class GeneratedTestAdd_UnknownType {

    @Test
    public void testAdd_UnknownType() {
        PropertyListBuilder propertyListBuilder = new PropertyListBuilder();
        Property<?> property = new Property<>("path", Object.class, new Object());
        propertyListBuilder.add(property);
    }

}