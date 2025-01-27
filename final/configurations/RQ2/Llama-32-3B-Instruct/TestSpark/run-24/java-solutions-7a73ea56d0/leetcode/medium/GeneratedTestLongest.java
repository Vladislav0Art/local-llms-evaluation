package leetcode.medium;

public class GeneratedTestLongest {

    public static class Test {
        public int next(int i) {
            return i + 1;
        }

        public String longest() {
            return "longest";
        }
    }

    @Test
    public void testLongest() {
        Test3 test3 = new GeneratedTest().new Test3() {
            @Override
            public String longest() {
                return "custom longest";
            }
        };
        // Test implementation
    }

}