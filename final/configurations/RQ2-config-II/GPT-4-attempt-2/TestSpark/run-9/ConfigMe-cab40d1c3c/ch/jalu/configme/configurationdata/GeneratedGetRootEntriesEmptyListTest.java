package ch.jalu.configme.configurationdata;

import ch.jalu.configme.properties.Property;
import ch.jalu.configme.exception.ConfigMeException;
import org.junit.Assert;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;

import org.junit.Test;

import java.util.List;
import java.util.Map;

public class GeneratedGetRootEntriesEmptyListTest {

    @Test
    public void getRootEntriesEmptyListTest() {
        PropertyListBuilder propertyListBuilder = new PropertyListBuilder();

        Map<String, Object> rootEntries = propertyListBuilder.getRootEntries();

        Assert.assertTrue(rootEntries.isEmpty());
    }

}