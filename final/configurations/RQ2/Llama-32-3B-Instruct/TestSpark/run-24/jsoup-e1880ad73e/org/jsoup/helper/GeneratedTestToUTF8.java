package org.jsoup.helper;

public class GeneratedTestToUTF8 {

    @Test
    public void testToUTF8() {
        String idn = "ä";
        Connection connection = new Connection();

        assertEquals("ä", connection.toUTF8(idn));
    }
}

public class Connection {

    public String toUTF8(String idn) {
        return idn;
    }

}