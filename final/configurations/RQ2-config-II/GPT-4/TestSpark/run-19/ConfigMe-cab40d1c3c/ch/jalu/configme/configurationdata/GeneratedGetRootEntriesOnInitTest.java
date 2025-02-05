package ch.jalu.configme.configurationdata;

import ch.jalu.configme.exception.ConfigMeException;
import ch.jalu.configme.properties.Property;
import ch.jalu.configme.configurationdata.PropertyListBuilder;
import org.junit.Assert;
import org.junit.Test;

import java.util.Collections;

public class GeneratedGetRootEntriesOnInitTest {

    @Test
    public void getRootEntriesOnInitTest() {
        PropertyListBuilder builder = new PropertyListBuilder();

        Assert.assertEquals(Collections.emptyMap(), builder.getRootEntries());
    }

}