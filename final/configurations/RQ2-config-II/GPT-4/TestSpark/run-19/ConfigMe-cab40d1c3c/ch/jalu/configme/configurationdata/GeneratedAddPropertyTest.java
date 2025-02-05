package ch.jalu.configme.configurationdata;

import ch.jalu.configme.exception.ConfigMeException;
import ch.jalu.configme.properties.Property;
import ch.jalu.configme.configurationdata.PropertyListBuilder;
import org.junit.Assert;
import org.junit.Test;

import java.util.Collections;

public class GeneratedAddPropertyTest {

    @Test
    public void addPropertyTest() {
        Property<Object> property = new Property<Object>("test_property") {
        };
        PropertyListBuilder builder = new PropertyListBuilder();

        builder.add(property);

        Assert.assertFalse(builder.create().isEmpty());
        Assert.assertEquals(property, builder.create().get(0));
    }

}