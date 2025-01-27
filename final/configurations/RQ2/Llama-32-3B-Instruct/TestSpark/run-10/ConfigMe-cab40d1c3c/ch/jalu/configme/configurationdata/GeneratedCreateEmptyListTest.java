package ch.jalu.configme.configurationdata;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class GeneratedCreateEmptyListTest {

    private final PropertyListBuilder builder = new PropertyListBuilder();

    @Test
    public void createEmptyListTest() {
        List<Property<?>> expected = new ArrayList<>();
        List<Property<?>> actual = builder.create();
        assertTrue(actual.isEmpty());
        assertSame(expected, actual);
    }

}