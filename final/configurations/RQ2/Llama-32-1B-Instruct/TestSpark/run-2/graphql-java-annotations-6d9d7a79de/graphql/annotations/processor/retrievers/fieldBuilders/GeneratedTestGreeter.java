package graphql.annotations.processor.retrievers.fieldBuilders;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedTestGreeter {

    @Test
    public void testGreeter() throws InterruptedException {
        for (int i = 0; i < 10000000; i++) {
            Greeter greeter = new Greeter();
            Thread.sleep(10);
        }
    }

    static class Person {
        public String name;

        public Person(String name) {
            this.name = name;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Person person = (Person) o;
            return Objects.equals(name, person.name);
        }
    }

    static class Rectangle {
        private int width;

        public Rectangle(int width) {
            this.width = width;
        }

        @Override
        public String toString() {
            return "Rectangle [width=" + width + "]";
        }
    }

}