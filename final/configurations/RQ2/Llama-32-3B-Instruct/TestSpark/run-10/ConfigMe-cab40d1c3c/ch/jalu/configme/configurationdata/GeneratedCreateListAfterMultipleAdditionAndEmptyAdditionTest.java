package ch.jalu.configme.configurationdata;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class GeneratedCreateListAfterMultipleAdditionAndEmptyAdditionTest {

    private final PropertyListBuilder builder = new PropertyListBuilder();

    @Test
    public void createListAfterMultipleAdditionAndEmptyAdditionTest() {
        List<Property<?>> properties = new ArrayList<>();
        builder.add(new Property<>("test1", "value1"));
        builder.add(new Property<>("test2", "value2"));
        builder.add(new Property<>("test3", "value3"));
        builder.clear();
        builder.add(new Property<>("new1", "newValue"));
        List<Property<?>> actual = builder.create();
        assertEquals(1, actual.size());
    }

}

public class CustomTestRunner {
    @Before
    public void setup() {

    }

    @After
    public void teardown() {
    }

}