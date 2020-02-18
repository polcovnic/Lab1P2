public class Group {
    Student[] students;
    int numberOfGroup;
    public Group(int numberOfGroup){
        if(checking(numberOfGroup)) System.out.println("error");
        else{
            creating(numberOfGroup);
        }
    }

    private int temp=1;

void m(){
    
}
    private boolean checking(int numberOfGroup){
        for (int i = 0; i < groups.length; i++) {
            if(numberOfGroup==groups[i])return true;
        }
        return false;
    }
    void creating(int numberOfGroup){
        temp++;
        groups = new int[temp];
    }
    static int[] groups = new int[1];

}
