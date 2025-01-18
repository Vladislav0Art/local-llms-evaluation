package graphql.annotations.processor.retrievers.fieldBuilders;

import graphql.annotations.annotationTypes.directives.activation.GraphQLDirectives;
import graphql.annotations.processor.ProcessingElementsContainer;
import graphql.annotations.processor.exceptions.GraphQLAnnotationsException;
import graphql.annotations.processor.retrievers.fieldBuilders.DirectivesBuilder;
import graphql.schema.GraphQLDirective;
import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;

public class GeneratedBuildTest_ErrorProcessingDirective_ThrowException {

    @Test
    public void buildTest_ErrorProcessingDirective_ThrowException() throws NoSuchMethodException {
        Method method = MyClassWithErrorDirective.class.getMethod("myMethod");
        ProcessingElementsContainer container = Mockito.mock(ProcessingElementsContainer.class);
        Mockito.when(container.getDirective(Mockito.any(Class.class), Mockito.any(Annotation.class),
                Mockito.any(Promise.class))).thenThrow(GraphQLAnnotationsException.class);

        DirectivesBuilder builder = new DirectivesBuilder(method, container);

        try {
            builder.build();
            Assert.fail();
        } catch (GraphQLAnnotationsException e) {
            // Exception expected
        }
    }

    private static class MyClass {
        public void myMethod() {
        }
    }

    @GraphQLDirectives(values = {MyDirective.class, MyOtherDirective.class})
    private static class MyClassWithDirectives {
        public void myMethod() {
        }
    }

    @GraphQLDirectives(values = {MyDirectiveWithError.class})
    private static class MyClassWithErrorDirective {
        public void myMethod() {
        }
    }

}