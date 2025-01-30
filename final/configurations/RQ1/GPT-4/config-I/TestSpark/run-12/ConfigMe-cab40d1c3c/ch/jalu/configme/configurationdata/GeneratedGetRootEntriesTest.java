package ch.jalu.configme.configurationdata;

import org.junit.Test;
import ch.jalu.configme.exception.ConfigMeException;
import ch.jalu.configme.properties.Property;
import ch.jalu.configme.properties.StringProperty;

import java.util.List;
import java.util.Map;

import static org.hamcrest.CoreMatchers.not;
import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsCollectionContaining.hasItems;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.fail;

public class GeneratedGetRootEntriesTest {

    @Test
    public void getRootEntriesTest() {
        PropertyListBuilder propertyListBuilder = new PropertyListBuilder();
        Property prop1 = new StringProperty("Test.Property1", "default");
        Property prop2 = new StringProperty("Test.Property2", "default2");
        propertyListBuilder.add(prop1);
        propertyListBuilder.add(prop2);

        // Check object is not null and has the correct content
        assertThat(propertyListBuilder.getRootEntries(), is(not(null)));
        assertThat(((Map<String, Object>) propertyListBuilder.getRootEntries().get("Test")).get("Property1"), is(prop1));
        assertThat(((Map<String, Object>) propertyListBuilder.getRootEntries().get("Test")).get("Property2"), is(prop2));
    }

}