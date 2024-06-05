package com.springcore.springcore;

public class FamilyDetails {
        public int noOfMembers;
        public String motherName;
        public String fatherName;

        public FamilyDetails() {
                super();
        }

        public FamilyDetails(int noOfMembers, String motherName, String fatherName) {
                this.noOfMembers = noOfMembers;
                this.motherName = motherName;
                this.fatherName = fatherName;
        }

        @Override
        public String toString() {
                return "FamilyDetails [noOfMembers=" + noOfMembers + ", motherName=" + motherName + ", fatherName="
                                + fatherName + "]";
        }

        public int getNoOfMembers() {
                return noOfMembers;
        }

        public void setNoOfMembers(int noOfMembers) {
                this.noOfMembers = noOfMembers;
        }

        public String getMotherName() {
                return motherName;
        }

        public void setMotherName(String motherName) {
                this.motherName = motherName;
        }

        public String getFatherName() {
                return fatherName;
        }

        public void setFatherName(String fatherName) {
                this.fatherName = fatherName;
        }

}
