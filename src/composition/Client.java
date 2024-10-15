package composition;

public class Client {
    public static void main(String[] args) {

        Folder folder=new Folder("abc");

        folder.displayFiles();

        folder=null;

        System.gc();


    }
}
