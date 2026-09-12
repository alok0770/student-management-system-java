package studentManagementSystem;

    public class Student {

        private String name;
        private int rollNo;
        private int marks;
        private String branch;

        public Student(String name, int rollNo, int marks, String branch) {
            this.name = name;
            this.rollNo = rollNo;
            this.marks = marks;
            this.branch = branch;
        }

        public String getName() {
            return this.name;
        }

        public int getRollNo() {
            return this.rollNo;
        }

        public int getMarks() {
            return this.marks;
        }

        public String getBranch() {
            return this.branch;
        }
    }

