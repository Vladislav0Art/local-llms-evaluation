package graphql.annotations.processor.retrievers.fieldBuilders;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.List;

import static graphql.schema.GraphQLDirective.newDirective;
import static graphql.annotations.annotationTypes.directives.activation.GraphQLDirectives;
import static graphql.annotations.processor.ProcessingElementsContainer.*;
import static graphql.annotations.processor.exceptions.GraphQLAnnotationsException.*;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedGivenNullArgumentWhenInitializationThenExceptionThrown {

    @Mock
    private ProcessingElementsContainer container;

    @InjectMocks
    private DirectivesBuilder directivesBuilder;

    @Test
    public void givenNullArgumentWhenInitializationThenExceptionThrown() {
        assertThrows(GraphQLAnnotationsException.class, () -> new DirectivesBuilder(null, container));
    }
}

public class AnnotatedElementWithDirectives {
    private static final String DIRECTIVE = "directive";

    public GraphQLDirective getDirective() {
        return GraphQLDirectives.DIRECTIVE;
    }
}

public class AnnotatedElementWithoutDirectives {
}

private AnnotatedElement getAnnotatedElement() {
    return getAnnotatedElementWithDirectives();
}

private AnnotatedElement getAnnotatedElementWithDirectives() {
    return new AnnotatedElementWithDirectives();
}

}