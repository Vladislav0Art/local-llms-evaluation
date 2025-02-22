package ch.jalu.configme.configurationdata;

import ch.jalu.configme.configurationdata.PropertyListBuilder;
import ch.jalu.configme.exception.ConfigMeException;
import ch.jalu.configme.properties.Property;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;

public class GeneratedAddProperty_duplicateProperty_throwsException {

    private PropertyListBuilder propertyListBuilder;

    @Test
    public void addProperty_duplicateProperty_throwsException() {
        propertyListBuilder = new PropertyListBuilder();
        Property<?> property = new Property<>("DataSource.mysql.host", String.class, "localhost");
        propertyListBuilder.add(property);

        assertThrows(ConfigMeException.class, () -> propertyListBuilder.add(property));
    }

}