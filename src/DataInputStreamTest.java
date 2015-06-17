
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author QuangAnh
 */
public class DataInputStreamTest {
    public void test() throws IOException{
        int num;
        DataInputStream d=new DataInputStream(System.in);
        
        System.out.println("Enter number:");
        
        num=d.readInt();
        DataOutputStream o=new DataOutputStream(System.out);
        o.write(num);
        System.out.println(num);
    }
    public static void main(String[] args) throws IOException {
        DataInputStreamTest d=new DataInputStreamTest();
        d.test();
    }
}
