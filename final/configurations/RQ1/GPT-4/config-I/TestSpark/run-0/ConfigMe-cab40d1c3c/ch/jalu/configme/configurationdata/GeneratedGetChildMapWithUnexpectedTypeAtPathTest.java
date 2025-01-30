package ch.jalu.configme.configurationdata;

import ch.jalu.configme.exception.ConfigMeException;
import ch.jalu.configme.properties.Property;
import org.junit.Assert;
import org.junit.Test;

import java.util.List;
import java.util.Map;

import static org.hamcrest.CoreMatchers.is;
import static org.mockito.Mockito.*;

public class GeneratedGetChildMapWithUnexpectedTypeAtPathTest {

    @Test
    public void getChildMapWithUnexpectedTypeAtPathTest() {
        // Arrange
        PropertyListBuilder listBuilder = new PropertyListBuilder();
        Map<String, Object> rootEntries = listBuilder.getRootEntries();
        rootEntries.put("wrong.type.path", new Object());

        // Act
        // Trying to get child map for the path where Object of unexpected type is already defined
        PropertyListBuilder spiedBuilder = spy(listBuilder);
        spiedBuilder.getChildMap(spiedBuilder.getRootEntries(), "wrong.type.path");
    }

}