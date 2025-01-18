package com.crowdin.client.core.http.impl.json;

import com.fasterxml.jackson.core.JsonProcessingException;
import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

public class GeneratedConvertInvalidObjectToJsonStringTest {

    @Test
    public void convertInvalidObjectToJsonStringTest() {
        JacksonJsonTransformer transformer = new JacksonJsonTransformer();
        TestInvalidItem invalidItem = new TestInvalidItem(1, "Item 1");

        transformer.convert(invalidItem);
    }
}

class TestItem {
    private int id;
    private String name;

    TestItem(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}

// A class that can't be serialized to JSON
class TestInvalidItem {
    private transient int id;
    private String name;

    TestInvalidItem(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

}