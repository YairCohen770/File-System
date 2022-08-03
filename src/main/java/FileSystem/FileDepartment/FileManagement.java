package FileSystem.FileDepartment;

public interface FileManagement {

    public void createFileOrFolder(String fileName);
    public void deleteFileOrFolder(String fileName);

    public void printFolder(String folderName);
}
