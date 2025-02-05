package ch.jalu.configme.configurationdata;

import ch.jalu.configme.exception.ConfigMeException;
import ch.jalu.configme.properties.Property;
import ch.jalu.configme.configurationdata.PropertyListBuilder;
import org.junit.Test;
import org.junit.Assert;

import java.util.List;
import java.util.Map;

import org.mockito.Mockito;

public class GeneratedGetRootEntriesEmptyBuilderTest {

    @Test
    public void getRootEntriesEmptyBuilderTest() {
        // Given
        PropertyListBuilder builder = new PropertyListBuilder();

        // When
        Map<String, Object> entries = builder.getRootEntries();

        // Then
        Assert.assertTrue(entries.isEmpty());
    }

}