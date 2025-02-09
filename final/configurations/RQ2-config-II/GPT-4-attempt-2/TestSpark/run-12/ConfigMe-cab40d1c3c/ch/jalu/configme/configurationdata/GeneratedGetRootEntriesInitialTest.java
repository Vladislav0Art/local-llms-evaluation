package ch.jalu.configme.configurationdata;

import ch.jalu.configme.exception.ConfigMeException;
import ch.jalu.configme.properties.Property;
import org.junit.Test;
import org.mockito.Mockito;

import java.util.List;

import static org.junit.Assert.*;

public class GeneratedGetRootEntriesInitialTest {

    @Test
    public void getRootEntriesInitialTest() {
        PropertyListBuilder propertyListBuilder = new PropertyListBuilder();
        assertNotNull(propertyListBuilder.getRootEntries());
        assertTrue(propertyListBuilder.getRootEntries().isEmpty());
    }

}