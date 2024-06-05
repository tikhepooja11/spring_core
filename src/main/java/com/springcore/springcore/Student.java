package com.springcore.springcore;

import java.util.List;
import java.util.Set;
import java.util.Map;
import java.util.Properties;

public class Student {
        public int studentId;
        public String studentName;
        public String studentAddress;
        public List<String> marks;
        public Set<String> subjects;
        public Map<String, String> examScore;
        public Properties coursesDuration;
        public FamilyDetails familyDetails;

        public Student() {
                super();
        }

        public Student(int studentId, String studentName, String studentAddress,
                        FamilyDetails familyDetails) {
                this.studentId = studentId;
                this.studentName = studentName;
                this.studentAddress = studentAddress;
                this.familyDetails = familyDetails;
        }

        // public Student(int studentId, String studentName, String studentAddress,
        // List<String> marks,
        // Set<String> subjects, Map<String, String> examScore, Properties
        // coursesDuration,
        // FamilyDetails familyDetails) {
        // this.studentId = studentId;
        // this.studentName = studentName;
        // this.studentAddress = studentAddress;
        // this.marks = marks;
        // this.subjects = subjects;
        // this.examScore = examScore;
        // this.coursesDuration = coursesDuration;
        // this.familyDetails = familyDetails;
        // }

        public Student(int studentId, String studentName, String studentAddress, List<String> marks,
                        Set<String> subjects, Map<String, String> examScore, Properties coursesDuration,
                        FamilyDetails familyDetails) {
                this.studentId = studentId;
                this.studentName = studentName;
                this.studentAddress = studentAddress;
                this.marks = marks;
                this.subjects = subjects;
                this.examScore = examScore;
                this.coursesDuration = coursesDuration;
                this.familyDetails = familyDetails;
        }

        @Override
        public String toString() {
                return "Student \n[studentId=" + studentId + ",\n studentName=" + studentName + ",\n studentAddress="
                                + studentAddress + ",\n marks=" + marks + ",\n subjects=" + subjects + ",\n examScore="
                                + examScore + ",\n coursesDuration=" + coursesDuration + ",\n familyDetails="
                                + familyDetails + "]\n\n";
        }

        public FamilyDetails getFamilyDetails() {
                return familyDetails;
        }

        public void setFamilyDetails(FamilyDetails familyDetails) {
                this.familyDetails = familyDetails;
        }

        public int getStudentId() {
                return studentId;
        }

        // setter injection method
        public void setStudentId(int studentId) {
                this.studentId = studentId;
        }

        public String getStudentName() {
                return studentName;
        }

        public void setStudentName(String studentName) {
                this.studentName = studentName;
        }

        public String getStudentAddress() {
                return studentAddress;
        }

        public void setStudentAddress(String studentAddress) {
                this.studentAddress = studentAddress;
        }

        // ---------------------
        public List<String> getMarks() {
                return marks;
        }

        public void setMarks(List<String> marks) {
                this.marks = marks;
        }

        public Properties getCoursesDuration() {
                return coursesDuration;
        }

        public void setCoursesDuration(Properties coursesDuration) {
                this.coursesDuration = coursesDuration;
        }

        public Set<String> getSubjects() {
                return subjects;
        }

        public void setSubjects(Set<String> subjects) {
                this.subjects = subjects;
        }

        public Map<String, String> getExamScore() {
                return examScore;
        }

        public void setExamScore(Map<String, String> examScore) {
                this.examScore = examScore;
        }

}
