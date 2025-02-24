package ch.jalu.configme.configurationdata;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertThrows;

import org.junit.Test;
import ch.jalu.configme.properties.Property;

public class GeneratedAddShouldThrowExceptionOnNullProperty {

    private PropertyListBuilder propertyListBuilder;

    @Test
    public void addShouldThrowExceptionOnNullProperty() {
        propertyListBuilder = new PropertyListBuilder();
        assertThrows(ConfigMeException.class, () -> propertyListBuilder.add(null));
    }

}