import static org.junit.jupiter.api.Assertions.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.jupiter.api.Test;

class BookLibrarianTest {

    BookLibrarian testObject = new BookLibrarian();
    
    @Test
    void test() {
        var os = new ByteArrayOutputStream();
        System.setOut(new PrintStream(os));
        
        testObject.printList();
        assertEquals("Islam Folklore", os.toString().substring(0, 14));
        os.reset();
        
        testObject.setSorter(new TitleSort());
        testObject.printList();
        assertEquals("A study", os.toString().substring(0, 7));
    }

}
