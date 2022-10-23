package br.com.datastructures.dynamicarray;

import java.util.Arrays;

public class DynamicArray {

    private Person[] people = new Person[100];
    private int totalMembers = 0;

    public void addMember(Person person) {
        this.secureSpace();
        this.people[this.totalMembers] = person;
        this.totalMembers++;
    }

    private boolean isValidPositionA(int index) {
        return (index >= 0 && index <= this.totalMembers);
    }

    private void secureSpace() {
        if (this.totalMembers == this.people.length) {
            Person[] newArray = new Person[this.people.length * 2];

            for (int i = 0; i < this.people.length; i++) {
                newArray[i] = this.people[i];
            }

            this.people = newArray;
        }
    }

    public void addMember(Person person, int index) {
        this.secureSpace();
        if (!isValidPositionA(index)) {
            throw new IllegalArgumentException("Invalid position! (Add case)");
        }
        for (int i = this.totalMembers - 1; i >= index; i--) {
            people[i + 1] = people[i];
        }
        people[index] = person;
        this.totalMembers++;
    }

    public void removeMember(int index) {
        for (int i = index; i < this.totalMembers - 1; i++) {
            people[i] = people[i + 1];
        }
        this.totalMembers--;
        people[this.totalMembers] = null;
    }

    private boolean isValidPositionG(int index) {
        return (index >= 0 && index < this.totalMembers);
    }

    public Person getMember(int index) {
        if (!isValidPositionG(index)) {
            throw new IllegalArgumentException("Invalid position! (Get case)");
        }
        return people[index];
    }

    public boolean isInArray(Person person) {
        for (int i = 0; i < this.totalMembers; i++) {   // i < totalMembers so that a NullPointerException is avoided
            if (person.equals(people[i])) {
                return true;
            }
        }
        return false;
    }

    public int getArraySize() {
        return this.totalMembers;
    }

    public String toString() {
        return Arrays.toString(people);
    }

}
