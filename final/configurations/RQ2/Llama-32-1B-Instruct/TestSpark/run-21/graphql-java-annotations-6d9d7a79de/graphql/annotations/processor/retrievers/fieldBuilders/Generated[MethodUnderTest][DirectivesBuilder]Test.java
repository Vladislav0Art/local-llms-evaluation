package graphql.annotations.processor.retrievers.fieldBuilders;

import org.junit.Test;

public class Generated[MethodUnderTest][DirectivesBuilder]

Test {

    @Test
    public void [MethodUnderTest][DirectivesBuilder]Test() {
        AnnotatedElement object = new AnnotatedElement("Greeter", "com.example.Greeter");
        ProcessingElementsContainer container = new ProcessingElementsContainer();

        try {
            DirectivesBuilder directiviesBuilder = new DirectivesBuilder(object, container);
            GraphQLDirective[] directives = directiviesBuilder.build();
            // assertions
        } finally {
            Mockito.resetAllMocks();
        }
    }

}