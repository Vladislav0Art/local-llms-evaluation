package ch.jalu.configme.configurationdata;

import ch.jalu.configme.configurationdata.PropertyListBuilder;
import ch.jalu.configme.properties.Property;
import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Map;
import java.util.List;

import org.mockito.Mockito;

public class GeneratedGetRootEntriesWhenNoPropertyAddedTest {

    @Test
    public void getRootEntriesWhenNoPropertyAddedTest() {
        PropertyListBuilder builder = new PropertyListBuilder();
        Map<String, Object> rootEntries = builder.getRootEntries();

        assertTrue(rootEntries.isEmpty());
    }

}