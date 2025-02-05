package ch.jalu.configme.configurationdata;

import ch.jalu.configme.exception.ConfigMeException;
import ch.jalu.configme.properties.Property;
import ch.jalu.configme.configurationdata.PropertyListBuilder;
import org.junit.Assert;
import org.junit.Test;

import java.util.Collections;

public class GeneratedGetRootEntriesAfterAddingPropertyTest {

    @Test
    public void getRootEntriesAfterAddingPropertyTest() {
        PropertyListBuilder builder = new PropertyListBuilder();
        Property<Object> property = new Property<Object>("test_property") {
        };

        builder.add(property);

        Assert.assertTrue(builder.getRootEntries().containsKey("test_property"));
        Assert.assertEquals(property.getDefaultValue(), builder.getRootEntries().get("test_property"));
    }

}