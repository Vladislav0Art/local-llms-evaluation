package ch.jalu.configme.configurationdata;

import ch.jalu.configme.configurationdata.PropertyListBuilder;
import ch.jalu.configme.exception.ConfigMeException;
import ch.jalu.configme.properties.Property;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;

public class GeneratedTest {

    private PropertyListBuilder propertyListBuilder;

    @Test
    public void addProperty_validProperty_propertyAdded() {
        propertyListBuilder = new PropertyListBuilder();
        Property<?> property = new Property<>("DataSource.mysql.host", String.class, "localhost");

        propertyListBuilder.add(property);

        assertEquals(1, propertyListBuilder.create().size());
    }

    @Test
    public void addProperty_duplicateProperty_throwsException() {
        propertyListBuilder = new PropertyListBuilder();
        Property<?> property = new Property<>("DataSource.mysql.host", String.class, "localhost");
        propertyListBuilder.add(property);

        assertThrows(ConfigMeException.class, () -> propertyListBuilder.add(property));
    }

    @Test
    public void create_noPropertiesAdded_emptyList() {
        propertyListBuilder = new PropertyListBuilder();

        assertEquals(0, propertyListBuilder.create().size());
    }

}