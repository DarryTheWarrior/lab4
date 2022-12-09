package org.example;
/**
 * Container class
 */
public class Person {
    /**
     * Сlass elements
     */
    private int id;
    private String name;
    private String gender;
    private String BirthDay;
    private Division div;
    private int Salary;

    /**
     * class constructor
     * @param A line read from file
     */
    public Person(String[] A){
        if(A==null)
            throw new RuntimeException("file read error");
        this.id =Integer.parseInt(A[0]);
        this.name=new String(A[1]);
        this.gender = new String(A[2]);
        this.BirthDay=new String(A[3]);
        this.div=new Division(A[4]);
        this.Salary=Integer.parseInt(A[5]);
    }

    /**
     * change function id
     * @param newID new field value id type int
     */
    public void setID(int newID){
        this.id=newID;
    }
    /**
     * change function id
     * @param newID new field value id type string
     */
    public void setID(String newID){
        this.id=Integer.parseInt(newID);
    }

    /**
     * change function name
     * @param newName new field value name
     */
    public void setName(String newName){
        this.name=newName;
    }

    /**
     *change function gender
     * @param newGender new field value gender
     */
    public void setGender(String newGender){
        this.gender=newGender;
    }

    /**
     *change function birthday
     * @param newBirt new field birtday
     */
    public void setBirtDay(String newBirt){
        this.BirthDay=newBirt;
    }

    /**
     *change function salary
     * @param newSalary new field salary type int
     */
    public void setSalary(int newSalary){
        this.Salary=newSalary;
    }

    /**
     *change function salary
     * @param newSalary new field salary type string
     */
    public void setSalary(String newSalary){
        this.Salary=Integer.parseInt(newSalary);
    }

    /**
     *change function Division
     * @param newID_key new field ID
     * @param newTitle new field name
     */
    public void setDiv(int newID_key,String newTitle){
        this.div.setID(newID_key);
        this.div.setTitle(newTitle);
    }

    /**
     *get value function id
     * @return value id
     */
    public int getId(){
        return this.id;
    }

    /**
     *get value function salary
     * @return value Salary
     */
    public int getSalary(){
        return this.Salary;
    }

    /**
     *get value function name
     * @return value name
     */
    public String getName(){
        return this.name;
    }

    /**
     *get value function gender
     * @return value gender
     */
    public String getGender(){
        return this.gender;
    }

    /**
     *get value function birthday
     * @return value birthday
     */
    public String getBirthDay(){
        return  this.BirthDay;
    }

    public String toString() {
        return
              "id=" + id +
              " , Name='" + name + ' ' +
              ", Gender='" + gender + ' ' +
              ", BirthDay='" + BirthDay + ' ' +
              ", Division " + div.getDiv() +
              ", Salary=" + Salary + ' ';
                            }
}