package FileSystem.AuxiliaryTestDepartment;

public class AuxiliaryTestManagementImpl implements AuxiliaryTestManagement {

    @Override
    public boolean isFileOrFolderExist(String name) {
        return false;
    }

    @Override
    public boolean isNameEmpty(String name) {
        return name.isEmpty();
    }

    @Override
    public boolean isFile(String name) {
        return name.contains(".");
    }


}
