package ch.jalu.configme.configurationdata;

import ch.jalu.configme.configurationdata.PropertyListBuilder;
import ch.jalu.configme.exception.ConfigMeException;
import ch.jalu.configme.properties.Property;
import org.junit.Test;

import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;
import static org.junit.Assert.fail;

public class GeneratedGetRootEntriesNonExistingPropertyTest {

    @Test
    public void getRootEntriesNonExistingPropertyTest() {
        PropertyListBuilder builder = new PropertyListBuilder();
        Property<String> property = Property.newStringProperty("root_property");
        builder.add(property);

        Object rootEntry = builder.getRootEntries().get("non_existing_property");

        assertThat("Root entries map should not contain non-existing property", rootEntry, is(nullValue()));
    }

}