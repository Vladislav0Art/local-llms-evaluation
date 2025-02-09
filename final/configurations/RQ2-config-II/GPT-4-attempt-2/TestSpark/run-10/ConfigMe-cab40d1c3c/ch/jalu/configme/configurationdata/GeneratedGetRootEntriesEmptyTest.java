package ch.jalu.configme.configurationdata;

import org.junit.Test;
import org.mockito.Mockito;

import static org.junit.Assert.*;

import ch.jalu.configme.exception.ConfigMeException;
import ch.jalu.configme.properties.Property;
import ch.jalu.configme.configurationdata.PropertyListBuilder;

public class GeneratedGetRootEntriesEmptyTest {

    @Test
    public void getRootEntriesEmptyTest() {
        PropertyListBuilder listBuilder = new PropertyListBuilder();
        assertTrue(listBuilder.getRootEntries().isEmpty());
    }

}