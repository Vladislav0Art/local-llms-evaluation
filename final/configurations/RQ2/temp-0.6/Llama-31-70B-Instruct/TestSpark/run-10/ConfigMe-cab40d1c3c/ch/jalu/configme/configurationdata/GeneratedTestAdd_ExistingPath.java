package ch.jalu.configme.configurationdata;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class GeneratedTestAdd_ExistingPath {

    @Test
    public void testAdd_ExistingPath() {
        PropertyListBuilder propertyListBuilder = new PropertyListBuilder();
        Property<String> property = new Property<>("path", String.class, "value");
        propertyListBuilder.add(property);
        propertyListBuilder.add(property);
    }

}