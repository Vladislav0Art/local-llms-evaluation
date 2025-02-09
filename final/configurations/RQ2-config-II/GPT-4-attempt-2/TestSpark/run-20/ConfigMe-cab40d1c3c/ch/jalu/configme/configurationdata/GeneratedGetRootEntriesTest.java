package ch.jalu.configme.configurationdata;

import org.junit.Test;
import org.mockito.Mockito;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import ch.jalu.configme.exception.ConfigMeException;
import ch.jalu.configme.properties.Property;

public class GeneratedGetRootEntriesTest {

    @Test
    public void getRootEntriesTest() {
        PropertyListBuilder propertyListBuilder = new PropertyListBuilder();
        Map<String, Object> myRootEntries = propertyListBuilder.getRootEntries();
        assertTrue(myRootEntries.isEmpty());
    }

}