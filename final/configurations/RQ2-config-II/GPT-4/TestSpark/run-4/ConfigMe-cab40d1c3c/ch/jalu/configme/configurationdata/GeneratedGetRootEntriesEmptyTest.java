package ch.jalu.configme.configurationdata;

import org.junit.Test;
import ch.jalu.configme.configurationdata.PropertyListBuilder;
import ch.jalu.configme.properties.Property;
import ch.jalu.configme.exception.ConfigMeException;

import java.util.List;

import static org.junit.Assert.*;

public class GeneratedGetRootEntriesEmptyTest {

    @Test
    public void getRootEntriesEmptyTest() {
        PropertyListBuilder propertyListBuilder = new PropertyListBuilder();

        // Fetch the root entries, which should be empty as no properties have been added
        Map<String, Object> rootEntries = propertyListBuilder.getRootEntries();

        assertTrue("The root entries should be empty", rootEntries.isEmpty());
    }

}