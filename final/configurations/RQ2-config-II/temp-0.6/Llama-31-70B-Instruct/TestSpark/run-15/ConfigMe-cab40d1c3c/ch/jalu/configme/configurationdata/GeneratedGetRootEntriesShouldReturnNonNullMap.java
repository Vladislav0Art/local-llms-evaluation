package ch.jalu.configme.configurationdata;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertThrows;

import org.junit.Test;
import ch.jalu.configme.properties.Property;

public class GeneratedGetRootEntriesShouldReturnNonNullMap {

    private PropertyListBuilder propertyListBuilder;

    @Test
    public void getRootEntriesShouldReturnNonNullMap() {
        propertyListBuilder = new PropertyListBuilder();
        Map<String, Object> rootEntries = propertyListBuilder.getRootEntries();
        assertNotNull(rootEntries);
    }

}