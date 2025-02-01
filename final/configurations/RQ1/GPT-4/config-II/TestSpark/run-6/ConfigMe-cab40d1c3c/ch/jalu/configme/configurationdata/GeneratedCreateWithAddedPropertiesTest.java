package ch.jalu.configme.configurationdata;

import ch.jalu.configme.exception.ConfigMeException;
import ch.jalu.configme.properties.Property;
import org.junit.Test;

import static org.junit.Assert.*;

import java.util.List;

public class GeneratedCreateWithAddedPropertiesTest {

    @Test
    public void createWithAddedPropertiesTest() {
        PropertyListBuilder builder = new PropertyListBuilder();
        Property<String> property1 = new Property<String>("DataSource.mysql.user", "test");
        Property<String> property2 = new Property<String>("DataSource.security.user", "test2");
        builder.add(property1);
        builder.add(property2);

        List<Property<?>> properties = builder.create();
        assertEquals(2, properties.size());
        assertEquals(property1, properties.get(0));
        assertEquals(property2, properties.get(1));
    }

}