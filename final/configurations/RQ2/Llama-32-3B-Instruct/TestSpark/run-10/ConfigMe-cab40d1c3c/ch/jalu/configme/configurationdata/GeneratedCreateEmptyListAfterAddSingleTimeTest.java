package ch.jalu.configme.configurationdata;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class GeneratedCreateEmptyListAfterAddSingleTimeTest {

    private final PropertyListBuilder builder = new PropertyListBuilder();

    @Test
    public void createEmptyListAfterAddSingleTimeTest() {
        List<Property<?>> properties = new ArrayList<>();
        builder.add(new Property<>("test", "value"));
        List<Property<?>> actual = builder.create();
        assertTrue(actual.isEmpty());
        assertSame(1, actual.size());
    }

}