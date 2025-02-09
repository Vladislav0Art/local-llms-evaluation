package ch.jalu.configme.configurationdata;

import ch.jalu.configme.exception.ConfigMeException;
import ch.jalu.configme.properties.Property;
import ch.jalu.configme.configurationdata.PropertyListBuilder;
import org.junit.Test;
import org.junit.Assert;
import org.mockito.Mockito;

import java.util.List;
import java.util.Map;

public class GeneratedGetRootEntriesInitiallyEmptyTest {

    @Test
    public void getRootEntriesInitiallyEmptyTest() {
        PropertyListBuilder propertyListBuilder = new PropertyListBuilder();

        Map<String, Object> rootEntries = propertyListBuilder.getRootEntries();

        Assert.assertNotNull(rootEntries);
        Assert.assertTrue(rootEntries.isEmpty());
    }

}