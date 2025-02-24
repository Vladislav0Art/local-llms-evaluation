package ch.jalu.configme.configurationdata;

import ch.jalu.configme.properties.Property;
import org.junit.Assert;
import org.junit.Test;

public class GeneratedAddNullProperty {

    @Test
    public void addNullProperty() {
        PropertyListBuilder propertyListBuilder = new PropertyListBuilder();
        Property<?> property = null;
        propertyListBuilder.add(property);
    }

}