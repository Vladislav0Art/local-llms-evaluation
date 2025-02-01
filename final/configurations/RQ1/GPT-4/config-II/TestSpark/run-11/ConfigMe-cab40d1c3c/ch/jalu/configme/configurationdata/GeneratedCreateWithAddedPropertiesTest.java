package ch.jalu.configme.configurationdata;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import ch.jalu.configme.exception.ConfigMeException;
import ch.jalu.configme.properties.Property;
import ch.jalu.configme.properties.StringProperty;
import org.junit.Test;

import java.util.List;
import java.util.Map;

public class GeneratedCreateWithAddedPropertiesTest {

    @Test
    public void createWithAddedPropertiesTest() {
        Property<String> property1 = new StringProperty("database.connection", "default");
        Property<String> property2 = new StringProperty("database.username", "admin");

        PropertyListBuilder builder = new PropertyListBuilder();
        builder.add(property1);
        builder.add(property2);

        List<Property<?>> properties = builder.create();

        assertEquals(2, properties.size());
        assertEquals(property1, properties.get(0));
        assertEquals(property2, properties.get(1));
    }

}