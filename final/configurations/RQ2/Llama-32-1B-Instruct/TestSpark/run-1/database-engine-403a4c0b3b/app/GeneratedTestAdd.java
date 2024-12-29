package app;

public class GeneratedTestAdd {

    @Test
    public void testAdd() {
        int result1 = Main.add(1, 2);
        int result2 = Main.add(-1, -1);
        assertEquals(3, result1);
        assertEquals(-1, result2);
    }

}