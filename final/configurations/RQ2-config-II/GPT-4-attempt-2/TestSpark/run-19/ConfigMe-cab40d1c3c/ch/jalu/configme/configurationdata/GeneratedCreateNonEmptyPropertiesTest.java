package ch.jalu.configme.configurationdata;

import ch.jalu.configme.configurationdata.PropertyListBuilder;
import ch.jalu.configme.exception.ConfigMeException;
import ch.jalu.configme.properties.Property;
import org.junit.Test;

import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;
import static org.junit.Assert.fail;

public class GeneratedCreateNonEmptyPropertiesTest {

    @Test
    public void createNonEmptyPropertiesTest() {
        PropertyListBuilder builder = new PropertyListBuilder();
        Property<Integer> property1 = Property.newIntegerProperty("test_property_1");
        Property<Double> property2 = Property.newDoubleProperty("test_property_2");
        builder.add(property1);
        builder.add(property2);

        List<Property<?>> properties = builder.create();

        assertThat(properties, hasSize(2));
        assertThat(properties, containsInAnyOrder(property1, property2));
    }

}