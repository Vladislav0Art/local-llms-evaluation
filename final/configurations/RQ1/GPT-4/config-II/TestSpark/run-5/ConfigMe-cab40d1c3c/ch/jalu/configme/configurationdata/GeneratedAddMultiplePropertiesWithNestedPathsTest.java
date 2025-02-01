package ch.jalu.configme.configurationdata;

import ch.jalu.configme.configurationdata.PropertyListBuilder;
import ch.jalu.configme.exception.ConfigMeException;
import ch.jalu.configme.properties.Property;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

public class GeneratedAddMultiplePropertiesWithNestedPathsTest {

    @Test
    public void addMultiplePropertiesWithNestedPathsTest() {
        Property<Boolean> property1 = Property.newProperty("test.path", true);
        Property<Boolean> property2 = Property.newProperty("test.path.inner", false);
        PropertyListBuilder builder = new PropertyListBuilder();
        builder.add(property1);
        builder.add(property2);

        List<Property<?>> properties = builder.create();
        assertEquals(2, properties.size());
        assertTrue(properties.contains(property1));
        assertTrue(properties.contains(property2));
    }

}