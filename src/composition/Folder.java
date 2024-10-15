package composition;

public class Folder {
    private String folderName;
    private File file;

    Folder(String folderName) {
        this.folderName = folderName;
        file = new File(folderName+folderName.length());
    }

    public void displayFiles(){
        System.out.println("Files Present in Folder :"+folderName);
        System.out.println("File Name :"+file.getFileName());
    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println("Destroying folder object");
    }
}
