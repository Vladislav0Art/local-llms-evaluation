package ch.jalu.configme.configurationdata;

import ch.jalu.configme.exception.ConfigMeException;
import ch.jalu.configme.properties.Property;
import org.junit.Assert;
import org.junit.Test;

import java.util.List;
import java.util.Map;

public class GeneratedGetRootEntriesWhenEmptyTest {

    @Test
    public void getRootEntriesWhenEmptyTest() {
        PropertyListBuilder propertyListBuilder = new PropertyListBuilder();

        Map<String, Object> rootEntries = propertyListBuilder.getRootEntries();

        Assert.assertEquals(0, rootEntries.size());
    }

}