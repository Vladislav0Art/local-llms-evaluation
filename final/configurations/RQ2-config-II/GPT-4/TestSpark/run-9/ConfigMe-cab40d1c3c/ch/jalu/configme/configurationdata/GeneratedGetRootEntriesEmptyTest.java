package ch.jalu.configme.configurationdata;

import ch.jalu.configme.properties.Property;
import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

import java.util.List;

public class GeneratedGetRootEntriesEmptyTest {

    @Test
    public void getRootEntriesEmptyTest() {
        // Given
        PropertyListBuilder propertyListBuilder = new PropertyListBuilder();

        // Then
        Assert.assertTrue(propertyListBuilder.getRootEntries().isEmpty());
    }

}