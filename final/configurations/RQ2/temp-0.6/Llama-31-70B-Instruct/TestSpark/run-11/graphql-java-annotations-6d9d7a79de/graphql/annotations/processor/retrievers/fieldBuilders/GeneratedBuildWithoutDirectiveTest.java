package graphql.annotations.processor.retrievers.fieldBuilders;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import java.lang.annotation.Annotation;
import java.lang.reflect.AnnotatedElement;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedBuildWithoutDirectiveTest {

    @Mock
    private AnnotatedElement mockObject;

    @Mock
    private ProcessingElementsContainer mockContainer;

    @Test
    public void buildWithoutDirectiveTest() {
        DirectivesBuilder directivesBuilder = new DirectivesBuilder(mockObject, mockContainer);
        GraphQLDirective[] directives = directivesBuilder.build();
        assertNull(directives);
    }

}