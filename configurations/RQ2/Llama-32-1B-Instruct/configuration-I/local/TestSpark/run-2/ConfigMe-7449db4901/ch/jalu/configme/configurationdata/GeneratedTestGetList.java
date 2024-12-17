package ch.jalu.configme.configurationdata;

import org.junit.jupiter.api.Test;

import static org.mockito.Mockito.*;

public class GeneratedTestGetList {

    @Test
    public void testGetList() {
        List<String> list = new ArrayList<>();
        list.add("value1");
        list.add("value2");

        when(getAllComments()).thenReturn(list);

        assertEquals(Arrays.asList("value1", "value2"), getAllComments());
    }

}