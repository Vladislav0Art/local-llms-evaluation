package graphql.annotations.processor.retrievers.fieldBuilders;

import org.junit.Test;

public class Generated[MethodUnderTest][DirectivesBuilder]

NoReconstructable {

    @Test
    public void [MethodUnderTest][DirectivesBuilder]NoReconstructable() {
        AnnotatedElement object = new AnnotatedElement("Greeter", "com.example.Greeter");
        ProcessingElementsContainer container = new ProcessingElementsContainer();

        try (Mockito.mock(AnnotatedElement.class)) {
            DirectivesBuilder directiviesBuilder = new DirectivesBuilder(object, container);
            GraphQLDirective[] directives = directiviesBuilder.build();
        }
    }

}