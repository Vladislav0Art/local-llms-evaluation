package ch.jalu.configme.configurationdata;

import org.junit.Test;
import ch.jalu.configme.configurationdata.PropertyListBuilder;
import ch.jalu.configme.properties.Property;
import ch.jalu.configme.exception.ConfigMeException;

import java.util.List;

import static org.junit.Assert.*;

public class GeneratedGetRootEntriesTest {

    @Test
    public void getRootEntriesTest() {
        PropertyListBuilder propertyListBuilder = new PropertyListBuilder();

        // Add some properties
        Property<?> property1 = new Property<String>("sample.path1", "default value1");
        Property<?> property2 = new Property<String>("sample.path2", "default value2");
        propertyListBuilder.add(property1);
        propertyListBuilder.add(property2);

        // Fetch the root entries, which should now include the properties that were added
        Map<String, Object> rootEntries = propertyListBuilder.getRootEntries();

        assertTrue("The root entries should contain the keys of the added properties",
                rootEntries.containsKey("sample.path1") && rootEntries.containsKey("sample.path2"));
    }

}