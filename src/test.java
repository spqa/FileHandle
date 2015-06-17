
import java.io.FileReader;
import java.io.FileWriter;
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
public class test {

    public static void main(String[] args) throws IOException {
        FileReader inObjStream = null;
        FileWriter outObjStream = null;
try {
inObjStream = new FileReader("test.txt");
outObjStream = new FileWriter("charoutputagain.txt");
int ch;
while ((ch = inObjStream.read()) != -1) {
outObjStream.write(ch);
}
} finally {
if (inObjStream != null) {
inObjStream.close();
}
}
} 

    }

