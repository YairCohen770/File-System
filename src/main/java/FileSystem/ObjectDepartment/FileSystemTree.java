package FileSystem.ObjectDepartment;

import java.util.ArrayList;

public class  FileSystemTree {
    public Node root;

    public class Node{
        public File file;
        public Node parent;
        public ArrayList<Node> children;
    }
}
