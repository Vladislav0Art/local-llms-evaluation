package ch.jalu.configme.configurationdata;

import ch.jalu.configme.configurationdata.PropertyListBuilder;
import ch.jalu.configme.exception.ConfigMeException;
import ch.jalu.configme.properties.Property;
import org.junit.Test;

import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;
import static org.junit.Assert.fail;

public class GeneratedAddValidPropertyTest {

    @Test
    public void addValidPropertyTest() {
        PropertyListBuilder builder = new PropertyListBuilder();
        Property<String> property = Property.newStringProperty("test_property");
        builder.add(property);

        try {
            List<Property<?>> properties = builder.create();
            assertThat(properties, hasItem(property));
        } catch (ConfigMeException e) {
            fail("Unexpected exception thrown during creation of properties list: " + e.getMessage());
        }
    }

}