package Testing;

import FileSystem.AuxiliaryTestDepartment.AuxiliaryTestManagement;
import FileSystem.AuxiliaryTestDepartment.AuxiliaryTestManagementImpl;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AuxiliaryTestManagementTesting {

    AuxiliaryTestManagement auxiliaryTestManagement = new AuxiliaryTestManagementImpl();

    @Test
    public void test_is_name_empty() {
        boolean result = auxiliaryTestManagement.isNameEmpty("newFile");
        Assert.assertEquals(false, result);
    }

    @Test
    public void test_is_file() {
        boolean result = auxiliaryTestManagement.isFile("newFile.txt");
        Assert.assertEquals(true, result);
    }
}
