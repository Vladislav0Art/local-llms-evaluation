package ch.jalu.configme.configurationdata;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GeneratedCreateEmptyList TestCreateEmptyList {

    @Test
    public void createEmptyList

    TestCreateEmptyList() {
        // Arrange

        // Act
        List<Property<?>> list = new ArrayList<>();
        list.addAll(PropertyListBuilder.getInstance().create());

        // Assert
        assertEquals(0, list.size());
    }

}