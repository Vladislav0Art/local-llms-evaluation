package ch.jalu.configme.configurationdata;

import ch.jalu.configme.configurationdata.PropertyListBuilder;
import ch.jalu.configme.exception.ConfigMeException;
import ch.jalu.configme.properties.Property;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

public class GeneratedAddPropertyToEmptyBuilderTest {

    @Test
    public void addPropertyToEmptyBuilderTest() {
        Property<Boolean> property = Property.newProperty("test.path", true);
        PropertyListBuilder builder = new PropertyListBuilder();
        builder.add(property);

        List<Property<?>> properties = builder.create();
        assertEquals(1, properties.size());
        assertEquals(property, properties.get(0));
    }

}