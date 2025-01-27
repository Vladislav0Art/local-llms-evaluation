package graphql.annotations.processor.retrievers.fieldBuilders;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GeneratedTestGenerateDirectiveBuilders {

    @Test
    public void testGenerateDirectiveBuilders() {
        // Arrange and Act
        List<DirectiveBuilder> directiveBuilders = generateDirectiveBuilders();
        DirectiveBuilder builder = new DirectiveBuilder("testdirective", "arg1");
        processingElementsContainer.execute(directiveBuilders);

        // Assert
        assertEquals(2, directiveBuilders.size());
    }

    public List<Directive> generateDirectives() {
        return Arrays.asList(
                new Directive("testdirective", "arg1"),
                new Directive("anotherdirective", "anotherarg")
        );
    }

    public List<DirectiveBuilder> generateDirectiveBuilders() {
        return Arrays.asList(
                new DirectiveBuilder("testdirective", "arg1"),
                new DirectiveBuilder("anotherdirective", "anotherarg")
        );
    }
}

class Directive implements java.util.List<java.lang.Object> {
    private String name;
    private String argument;

    public Directive(String name, String argument) {
        this.name = name;
        this.argument = argument;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Directive that = (Directive) o;
        return Objects.equals(name, that.name) && Objects.equals(argument, that.argument);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, argument);
    }
}

class DirectiveBuilder {
    private String name;
    private String argument;

    public DirectiveBuilder(String name, String argument) {
        this.name = name;
        this.argument = argument;
    }

    public java.util.List<Directive> build() {
        java.util.ArrayList<java.lang.Object> list = new java.util.ArrayList<>();
        list.add(new Directive(name, argument));
        return list;
    }
}

class ProcessingElementsContainer {
    public void execute(List<DirectiveBuilder> directiveBuilders) {
        // your logic here
    }

}