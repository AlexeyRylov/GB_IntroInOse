package ru.geekbrains.ose.HomeWork03.module;
        public class Student implements Comparable<Student>{
        private Long StudentId;
        private String lastName;
        private String firstName;
        private String secondName;



        public Student(String lastName, String firstName, String secondName) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.secondName = secondName;
        }

        public Student(Long studentId, String lastName, String firstName, String secondName) {
        StudentId = studentId;
        this.lastName = lastName;
        this.firstName = firstName;
        this.secondName = secondName;
        }

        public Long getStudentId() {
        return StudentId;
        }

        public String getLastName() {
        return lastName;
        }

        public String getFirstName() {
        return firstName;
        }

        public String getSecondName() {
        return secondName;
        }

        @Override
        // this o -> this > 0 = 1; this < o = -1; this == o = 0
        //this.firstName = "Никадим"
        // 0 .firstName = "Никита"
        /*
         * if(this.firstName > o.firstName)
         *   return 1;
         * else if (this.firstName < 0.firstName)
         *   return -1;
         * else return 0;*/
        public int compareTo(Student o) {
        return this.StudentId.compareTo(o.getStudentId());
        }

        }