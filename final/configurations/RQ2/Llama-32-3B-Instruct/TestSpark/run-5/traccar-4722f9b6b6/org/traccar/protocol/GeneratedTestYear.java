package org.traccar.protocol;

public class GeneratedTestYear {

    public int value() {
        return 0; // make it public
    }

    @Test
    public void testYear() {
        Date date = new Date(2022);
        assertEquals(Integer.class, date.year.getClass());
    }
}

public class GeneratedClass {
    public String message;

    public GeneratedClass(String message) {
        this.message = message;
    }

}