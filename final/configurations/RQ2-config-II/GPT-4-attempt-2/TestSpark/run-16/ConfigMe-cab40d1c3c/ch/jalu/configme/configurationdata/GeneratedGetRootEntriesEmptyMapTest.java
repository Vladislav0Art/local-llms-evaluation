package ch.jalu.configme.configurationdata;

import org.junit.Test;
import org.junit.Assert;

import static org.mockito.Mockito.*;

import ch.jalu.configme.exception.ConfigMeException;
import ch.jalu.configme.properties.Property;
import ch.jalu.configme.configurationdata.PropertyListBuilder;

import java.util.List;
import java.util.Map;

public class GeneratedGetRootEntriesEmptyMapTest {

    @Test
    public void getRootEntriesEmptyMapTest() {
        PropertyListBuilder propertyListBuilder = new PropertyListBuilder();

        Map<String, Object> map = propertyListBuilder.getRootEntries();

        Assert.assertTrue(map.isEmpty());
    }

}