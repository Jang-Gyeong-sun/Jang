import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class test {

    public static void main(String[] args) throws IOException{
        TestIf testif = new TestIfClass();

        testif.TestMethod();

        String str = "123";
        
        Integer.parseInt(str);

        System.out.println(str.length());

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        System.out.println(br.readLine());
    }

    
    
}

interface TestIf{
    void TestMethod();
}

class TestIfClass implements TestIf{
    
    public void TestMethod(){
        System.out.println("Test class");
    }
}