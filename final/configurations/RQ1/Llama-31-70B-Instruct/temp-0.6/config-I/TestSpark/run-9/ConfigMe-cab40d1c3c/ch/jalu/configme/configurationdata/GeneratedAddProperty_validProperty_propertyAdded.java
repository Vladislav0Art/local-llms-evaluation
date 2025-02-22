package ch.jalu.configme.configurationdata;

import ch.jalu.configme.configurationdata.PropertyListBuilder;
import ch.jalu.configme.exception.ConfigMeException;
import ch.jalu.configme.properties.Property;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;

public class GeneratedAddProperty_validProperty_propertyAdded {

    private PropertyListBuilder propertyListBuilder;

    @Test
    public void addProperty_validProperty_propertyAdded() {
        propertyListBuilder = new PropertyListBuilder();
        Property<?> property = new Property<>("DataSource.mysql.host", String.class, "localhost");

        propertyListBuilder.add(property);

        assertEquals(1, propertyListBuilder.create().size());
    }

}