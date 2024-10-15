package composition;

public class File {
    private String fileName;
    File(String fileName) {
        this.fileName = fileName;
    }

    public String getFileName() {
        return fileName;
    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println("Destroying file object");
    }
}
