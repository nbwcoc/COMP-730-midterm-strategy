import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;

class AuthorSortTest {

    AuthorSort testObject = new AuthorSort();
    
    @Test
    void testSort() {
        var testValues = new ArrayList<BookInformation>();
        String testNames[] = {"a", "b", "c"};
        for (int i = 2; i >= 0; i--)
            testValues.add(new BookInformation(testNames[i], 0, "", ""));
        
        var output = testObject.sort(testValues);

        for (int i = 0; i < 3; i++)
            assertEquals(testNames[i], output.get(i).getAuthor());
    }

}
