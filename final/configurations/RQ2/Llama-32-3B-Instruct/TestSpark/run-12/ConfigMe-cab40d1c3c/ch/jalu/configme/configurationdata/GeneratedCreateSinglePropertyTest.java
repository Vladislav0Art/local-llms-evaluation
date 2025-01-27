package ch.jalu.configme.configurationdata;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class GeneratedCreateSinglePropertyTest {

    @Test
    public void createSinglePropertyTest() {
        // Arrange & Act
        List<Property<?>> propertyList = new ArrayList<>();
        PropertyListBuilder builder = new PropertyListBuilder();
        builder.add(new Object());
        List<Property<?>> result = builder.create();

        // Assert
        assertEquals(1, result.size());
    }

}