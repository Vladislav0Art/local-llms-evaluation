package ch.jalu.configme.configurationdata;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertThrows;

import org.junit.Test;
import ch.jalu.configme.properties.Property;

public class GeneratedCreateShouldReturnNonNullList {

    private PropertyListBuilder propertyListBuilder;

    @Test
    public void createShouldReturnNonNullList() {
        propertyListBuilder = new PropertyListBuilder();
        List<Property<?>> propertyList = propertyListBuilder.create();
        assertNotNull(propertyList);
    }

}