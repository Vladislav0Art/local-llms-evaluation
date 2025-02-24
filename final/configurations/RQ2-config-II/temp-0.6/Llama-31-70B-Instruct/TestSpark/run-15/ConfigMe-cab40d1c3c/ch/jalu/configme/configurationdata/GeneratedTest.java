package ch.jalu.configme.configurationdata;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertThrows;

import org.junit.Test;
import ch.jalu.configme.properties.Property;

public class GeneratedTest {

    private PropertyListBuilder propertyListBuilder;

    @Test
    public void addShouldThrowExceptionOnNullProperty() {
        propertyListBuilder = new PropertyListBuilder();
        assertThrows(ConfigMeException.class, () -> propertyListBuilder.add(null));
    }

    @Test
    public void createShouldReturnNonNullList() {
        propertyListBuilder = new PropertyListBuilder();
        List<Property<?>> propertyList = propertyListBuilder.create();
        assertNotNull(propertyList);
    }

    @Test
    public void getRootEntriesShouldReturnNonNullMap() {
        propertyListBuilder = new PropertyListBuilder();
        Map<String, Object> rootEntries = propertyListBuilder.getRootEntries();
        assertNotNull(rootEntries);
    }

}