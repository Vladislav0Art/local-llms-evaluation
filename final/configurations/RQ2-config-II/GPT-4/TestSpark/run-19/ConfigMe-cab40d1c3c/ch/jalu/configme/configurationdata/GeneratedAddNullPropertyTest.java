package ch.jalu.configme.configurationdata;

import ch.jalu.configme.exception.ConfigMeException;
import ch.jalu.configme.properties.Property;
import ch.jalu.configme.configurationdata.PropertyListBuilder;
import org.junit.Assert;
import org.junit.Test;

import java.util.Collections;

public class GeneratedAddNullPropertyTest {

    @Test
    public void addNullPropertyTest() {
        Property<Object> property = null;
        PropertyListBuilder builder = new PropertyListBuilder();

        builder.add(property);
    }

}