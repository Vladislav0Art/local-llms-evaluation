package ch.jalu.configme.configurationdata;

import ch.jalu.configme.configurationdata.PropertyListBuilder;
import ch.jalu.configme.exception.ConfigMeException;
import ch.jalu.configme.properties.Property;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;

public class GeneratedCreate_noPropertiesAdded_emptyList {

    private PropertyListBuilder propertyListBuilder;

    @Test
    public void create_noPropertiesAdded_emptyList() {
        propertyListBuilder = new PropertyListBuilder();

        assertEquals(0, propertyListBuilder.create().size());
    }

}