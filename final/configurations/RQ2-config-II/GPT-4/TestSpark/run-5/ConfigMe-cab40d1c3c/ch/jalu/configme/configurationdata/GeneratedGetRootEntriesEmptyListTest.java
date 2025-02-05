package ch.jalu.configme.configurationdata;

import ch.jalu.configme.exception.ConfigMeException;
import ch.jalu.configme.properties.Property;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

public class GeneratedGetRootEntriesEmptyListTest {

    @Test
    public void getRootEntriesEmptyListTest() {
        PropertyListBuilder listBuilder = new PropertyListBuilder();

        assertTrue("Root Entries should be empty", listBuilder.getRootEntries().isEmpty());
    }

}