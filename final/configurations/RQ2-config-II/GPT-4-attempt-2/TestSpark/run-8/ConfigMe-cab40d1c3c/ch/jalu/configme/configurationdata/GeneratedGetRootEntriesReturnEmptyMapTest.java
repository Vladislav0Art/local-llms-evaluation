package ch.jalu.configme.configurationdata;

import ch.jalu.configme.exception.ConfigMeException;
import ch.jalu.configme.properties.Property;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.mock;

public class GeneratedGetRootEntriesReturnEmptyMapTest {

    @Test
    public void getRootEntriesReturnEmptyMapTest() {
        // Act
        PropertyListBuilder propertyListBuilder = new PropertyListBuilder();

        // Assert
        assertTrue(propertyListBuilder.getRootEntries().isEmpty());
    }

}